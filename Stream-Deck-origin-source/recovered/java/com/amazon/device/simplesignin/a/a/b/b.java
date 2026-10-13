package com.amazon.device.simplesignin.a.a.b;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.b.d;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f17273d = "SSI_LinkUserAccount";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f17274e = "1.0";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f17275f = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f17276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f17277c;

    public b(a aVar, LinkUserAccountRequest linkUserAccountRequest) {
        super(aVar, f17273d, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f17244d, linkUserAccountRequest.getPartnerUserId());
        super.a(com.amazon.device.simplesignin.a.a.a.f17241a, linkUserAccountRequest.getIdentityProviderName());
        super.a(com.amazon.device.simplesignin.a.a.a.f17245e, linkUserAccountRequest.getUserLoginName());
        super.a(com.amazon.device.simplesignin.a.a.a.f17248h, com.amazon.device.simplesignin.a.a.a.f17249i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f17233E, linkUserAccountRequest.getLinkToken().getSchema());
            super.a(com.amazon.device.simplesignin.a.a.a.f17247g, jSONObject.toString());
            super.a(com.amazon.device.simplesignin.a.a.a.f17246f, linkUserAccountRequest.getLinkSigningKey());
        } catch (JSONException e8) {
            com.amazon.device.simplesignin.a.d.a.b(f17275f, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e8);
        }
    }

    private void a(final Intent intent) {
        this.f17276b.b(d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.simplesignin.a.a.b.b.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity activityB = b.this.f17277c.b();
                    if (activityB == null) {
                        activityB = b.this.f17277c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f17275f, "Consent activity is about to start: " + activityB);
                    activityB.startActivity(intent);
                } catch (Exception e8) {
                    com.amazon.device.simplesignin.a.d.a.a(b.f17275f, "Exception when starting consent activity: " + e8);
                }
            }
        });
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map mapB = jVar.b();
        if (!mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f17250j) || mapB.get(com.amazon.device.simplesignin.a.a.a.f17250j) == null) {
            return super.a(mapB);
        }
        a((Intent) mapB.get(com.amazon.device.simplesignin.a.a.a.f17250j));
        return true;
    }
}
