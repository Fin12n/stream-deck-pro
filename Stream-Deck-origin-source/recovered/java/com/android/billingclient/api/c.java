package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC1995b;
import com.google.android.gms.internal.play_billing.AbstractC2027j;
import java.util.ArrayList;
import java.util.List;
import p138p3.N;
import p138p3.O;
import p138p3.P;
import p138p3.Q;
import p138p3.S;
import p138p3.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0416c f17383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC2027j f17384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f17385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17386g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f17389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f17390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C0416c.a f17392f;

        public /* synthetic */ a(N n8) {
            C0416c.a aVarA = C0416c.a();
            C0416c.a.e(aVarA);
            this.f17392f = aVarA;
        }

        public c a() {
            ArrayList arrayList = this.f17390d;
            boolean z8 = true;
            boolean z9 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f17389c;
            boolean z10 = (list == null || list.isEmpty()) ? false : true;
            if (!z9 && !z10) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z9 && z10) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            U u8 = null;
            if (!z9) {
                b bVar = (b) this.f17389c.get(0);
                for (int i8 = 0; i8 < this.f17389c.size(); i8++) {
                    b bVar2 = (b) this.f17389c.get(i8);
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i8 != 0 && !bVar2.b().e().equals(bVar.b().e()) && !bVar2.b().e().equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                String strH = bVar.b().h();
                for (b bVar3 : this.f17389c) {
                    if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !strH.equals(bVar3.b().h())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.f17390d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f17390d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f17390d.get(0);
                    String strB = skuDetails.b();
                    ArrayList arrayList2 = this.f17390d;
                    int size = arrayList2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i9);
                        if (!strB.equals("play_pass_subs") && !skuDetails2.b().equals("play_pass_subs") && !strB.equals(skuDetails2.b())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strF = skuDetails.f();
                    ArrayList arrayList3 = this.f17390d;
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i10);
                        if (!strB.equals("play_pass_subs") && !skuDetails3.b().equals("play_pass_subs") && !strF.equals(skuDetails3.f())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            c cVar = new c(u8);
            if ((!z9 || ((SkuDetails) this.f17390d.get(0)).f().isEmpty()) && (!z10 || ((b) this.f17389c.get(0)).b().h().isEmpty())) {
                z8 = false;
            }
            cVar.f17380a = z8;
            cVar.f17381b = this.f17387a;
            cVar.f17382c = this.f17388b;
            cVar.f17383d = this.f17392f.a();
            ArrayList arrayList4 = this.f17390d;
            cVar.f17385f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            cVar.f17386g = this.f17391e;
            List list2 = this.f17389c;
            cVar.f17384e = list2 != null ? AbstractC2027j.F(list2) : AbstractC2027j.G();
            return cVar;
        }

        public a b(boolean z8) {
            this.f17391e = z8;
            return this;
        }

        public a c(String str) {
            this.f17387a = str;
            return this;
        }

        public a d(List list) {
            this.f17389c = new ArrayList(list);
            return this;
        }

        public a e(C0416c c0416c) {
            this.f17392f = C0416c.c(c0416c);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f17393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17394b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public f f17395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f17396b;

            public /* synthetic */ a(O o8) {
            }

            public b a() {
                AbstractC1995b.c(this.f17395a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f17395a.f() != null) {
                    AbstractC1995b.c(this.f17396b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f17396b = str;
                return this;
            }

            public a c(f fVar) {
                this.f17395a = fVar;
                if (fVar.c() != null) {
                    fVar.c().getClass();
                    f.b bVarC = fVar.c();
                    if (bVarC.d() != null) {
                        this.f17396b = bVarC.d();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ b(a aVar, P p8) {
            this.f17393a = aVar.f17395a;
            this.f17394b = aVar.f17396b;
        }

        public static a a() {
            return new a(null);
        }

        public final f b() {
            return this.f17393a;
        }

        public final String c() {
            return this.f17394b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0416c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17399c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f17400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f17401b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f17402c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f17403d = 0;

            public /* synthetic */ a(Q q8) {
            }

            public static /* synthetic */ a e(a aVar) {
                aVar.f17402c = true;
                return aVar;
            }

            public C0416c a() {
                boolean z8 = true;
                S s8 = null;
                if (TextUtils.isEmpty(this.f17400a) && TextUtils.isEmpty(null)) {
                    z8 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f17401b);
                if (z8 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f17402c && !z8 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0416c c0416c = new C0416c(s8);
                c0416c.f17397a = this.f17400a;
                c0416c.f17399c = this.f17403d;
                c0416c.f17398b = this.f17401b;
                return c0416c;
            }

            public a b(String str) {
                this.f17400a = str;
                return this;
            }

            public a c(String str) {
                this.f17401b = str;
                return this;
            }

            public a d(int i8) {
                this.f17403d = i8;
                return this;
            }

            public final a f(String str) {
                this.f17400a = str;
                return this;
            }
        }

        public /* synthetic */ C0416c(S s8) {
        }

        public static a a() {
            return new a(null);
        }

        public static /* bridge */ /* synthetic */ a c(C0416c c0416c) {
            a aVarA = a();
            aVarA.f(c0416c.f17397a);
            aVarA.d(c0416c.f17399c);
            aVarA.c(c0416c.f17398b);
            return aVarA;
        }

        public final int b() {
            return this.f17399c;
        }

        public final String d() {
            return this.f17397a;
        }

        public final String e() {
            return this.f17398b;
        }
    }

    public /* synthetic */ c(U u8) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f17383d.b();
    }

    public final String c() {
        return this.f17381b;
    }

    public final String d() {
        return this.f17382c;
    }

    public final String e() {
        return this.f17383d.d();
    }

    public final String f() {
        return this.f17383d.e();
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f17385f);
        return arrayList;
    }

    public final List h() {
        return this.f17384e;
    }

    public final boolean p() {
        return this.f17386g;
    }

    public final boolean q() {
        return (this.f17381b == null && this.f17382c == null && this.f17383d.e() == null && this.f17383d.b() == 0 && !this.f17380a && !this.f17386g) ? false : true;
    }
}
