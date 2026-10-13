package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2019h extends AbstractC2003d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2027j f18905c;

    public C2019h(AbstractC2027j abstractC2027j, int i8) {
        super(abstractC2027j.size(), i8);
        this.f18905c = abstractC2027j;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003d
    public final Object b(int i8) {
        return this.f18905c.get(i8);
    }
}
