package com.revenuecat.purchases.common;

import D6.M;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import com.google.mlkit.common.internal.ckI.WqXA;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.OfferingsKt;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r7.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OfferingParser {
    public static final Companion Companion = new Companion(null);
    private static final r7.c json = p.b(null, OfferingParser$Companion$json$1.INSTANCE, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        public final r7.c getJson$purchases_defaultsRelease() {
            return OfferingParser.json;
        }

        private Companion() {
        }

        public static /* synthetic */ void getJson$purchases_defaultsRelease$annotations() {
        }
    }

    public final Package createPackage(JSONObject packageJson, Map<String, ? extends List<? extends StoreProduct>> productsById, PresentedOfferingContext presentedOfferingContext) throws JSONException {
        t.g(packageJson, "packageJson");
        t.g(productsById, "productsById");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        String packageIdentifier = packageJson.getString("identifier");
        StoreProduct storeProductFindMatchingProduct = findMatchingProduct(productsById, packageJson);
        t.f(packageIdentifier, "packageIdentifier");
        PackageType packageType = OfferingParserKt.toPackageType(packageIdentifier);
        if (storeProductFindMatchingProduct != null) {
            return new Package(packageIdentifier, packageType, storeProductFindMatchingProduct.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext);
        }
        return null;
    }

    public abstract StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> map, JSONObject jSONObject);

    public final Offering createOffering(JSONObject offeringJson, Map<String, ? extends List<? extends StoreProduct>> productsById) throws JSONException {
        Map mapG;
        PaywallData paywallData;
        PaywallData paywallData2;
        t.g(offeringJson, "offeringJson");
        t.g(productsById, "productsById");
        String offeringIdentifier = offeringJson.getString("identifier");
        JSONObject jSONObjectOptJSONObject = offeringJson.optJSONObject("metadata");
        if (jSONObjectOptJSONObject == null || (mapG = JSONObjectExtensionsKt.toMap(jSONObjectOptJSONObject, true)) == null) {
            mapG = M.g();
        }
        Map map = mapG;
        JSONArray jSONArray = offeringJson.getJSONArray("packages");
        t.f(offeringIdentifier, "offeringIdentifier");
        PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(offeringIdentifier);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject packageJson = jSONArray.getJSONObject(i8);
            t.f(packageJson, "packageJson");
            Package packageCreatePackage = createPackage(packageJson, productsById, presentedOfferingContext);
            if (packageCreatePackage != null) {
                arrayList.add(packageCreatePackage);
            }
        }
        JSONObject jSONObjectOptJSONObject2 = offeringJson.optJSONObject("paywall");
        if (jSONObjectOptJSONObject2 != null) {
            try {
                r7.c cVar = json;
                String string = jSONObjectOptJSONObject2.toString();
                t.f(string, "it.toString()");
                cVar.a();
                paywallData = (PaywallData) cVar.b(PaywallData.Companion.serializer(), string);
            } catch (Exception e8) {
                LogUtilsKt.errorLog("Error deserializing paywall data", e8);
                paywallData = null;
            }
            paywallData2 = paywallData;
        } else {
            paywallData2 = null;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String string2 = offeringJson.getString(WqXA.WTOHxqBcpZBwy);
        t.f(string2, "offeringJson.getString(\"description\")");
        return new Offering(offeringIdentifier, string2, map, arrayList, paywallData2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
    public final Offerings createOfferings(JSONObject offeringsJson, Map<String, ? extends List<? extends StoreProduct>> productsById) throws JSONException {
        Offerings.Targeting targeting;
        Offerings.Placements placements;
        Map map$default;
        t.g(offeringsJson, "offeringsJson");
        t.g(productsById, "productsById");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(OfferingStrings.BUILDING_OFFERINGS, Arrays.copyOf(new Object[]{Integer.valueOf(productsById.size())}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        JSONArray jSONArray = offeringsJson.getJSONArray("offerings");
        String string = offeringsJson.getString("current_offering_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject offeringJson = jSONArray.getJSONObject(i8);
            t.f(offeringJson, "offeringJson");
            Offering offeringCreateOffering = createOffering(offeringJson, productsById);
            if (offeringCreateOffering != null) {
                linkedHashMap.put(offeringCreateOffering.getIdentifier(), offeringCreateOffering);
                if (offeringCreateOffering.getAvailablePackages().isEmpty()) {
                    String str2 = String.format(OfferingStrings.OFFERING_EMPTY, Arrays.copyOf(new Object[]{offeringCreateOffering.getIdentifier()}, 1));
                    t.f(str2, "format(this, *args)");
                    LogUtilsKt.warnLog(str2);
                }
            }
        }
        JSONObject jSONObjectOptJSONObject = offeringsJson.optJSONObject("targeting");
        if (jSONObjectOptJSONObject != null) {
            Integer numOptNullableInt = JSONObjectExtensionsKt.optNullableInt(jSONObjectOptJSONObject, "revision");
            String strOptNullableString = JSONObjectExtensionsKt.optNullableString(jSONObjectOptJSONObject, "rule_id");
            if (numOptNullableInt == null || strOptNullableString == null) {
                LogUtilsKt.warnLog(OfferingStrings.TARGETING_ERROR);
                targeting = null;
            } else {
                targeting = new Offerings.Targeting(numOptNullableInt.intValue(), strOptNullableString);
            }
        } else {
            targeting = null;
        }
        JSONObject jSONObjectOptJSONObject2 = offeringsJson.optJSONObject("placements");
        if (jSONObjectOptJSONObject2 != null) {
            String nullableString = JSONObjectExtensionsKt.getNullableString(jSONObjectOptJSONObject2, LYdqVGvOGMNr.izi);
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("offering_ids_by_placement");
            Map mapReplaceJsonNullWithKotlinNull = (jSONObjectOptJSONObject3 == null || (map$default = JSONObjectExtensionsKt.toMap$default(jSONObjectOptJSONObject3, false, 1, null)) == null) ? null : JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull(map$default);
            if (mapReplaceJsonNullWithKotlinNull != null) {
                placements = new Offerings.Placements(nullableString, mapReplaceJsonNullWithKotlinNull);
            } else {
                placements = null;
            }
        } else {
            placements = null;
        }
        Offering offering = (Offering) linkedHashMap.get(string);
        return new Offerings(offering != null ? OfferingsKt.withPresentedContext(offering, null, targeting) : null, linkedHashMap, placements, targeting);
    }
}
