package p219z4;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p195w4.e;
import p203x4.a;
import p203x4.f;
import p211y4.InterfaceC3103d;
import p211y4.InterfaceC3109j;

/* JADX INFO: renamed from: z4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3198g extends AbstractC3194c implements a.f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C3195d f39208F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Set f39209G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Account f39210H;

    public AbstractC3198g(Context context, Looper looper, int i8, C3195d c3195d, f.a aVar, f.b bVar) {
        this(context, looper, i8, c3195d, (InterfaceC3103d) aVar, (InterfaceC3109j) bVar);
    }

    @Override // p219z4.AbstractC3194c
    public final Set B() {
        return this.f39209G;
    }

    @Override // x4.a.f
    public Set d() {
        return o() ? this.f39209G : Collections.EMPTY_SET;
    }

    public Set h0(Set set) {
        return set;
    }

    @Override // p219z4.AbstractC3194c
    public final Account t() {
        return this.f39210H;
    }

    @Override // p219z4.AbstractC3194c
    public Executor v() {
        return null;
    }

    public AbstractC3198g(Context context, Looper looper, int i8, C3195d c3195d, InterfaceC3103d interfaceC3103d, InterfaceC3109j interfaceC3109j) {
        this(context, looper, AbstractC3199h.b(context), e.m(), i8, c3195d, (InterfaceC3103d) AbstractC3207p.k(interfaceC3103d), (InterfaceC3109j) AbstractC3207p.k(interfaceC3109j));
    }

    public final Set i0(Set set) {
        Set setH0 = h0(set);
        Iterator it = setH0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException(SZCvugJaXc.AYfRceksnhikR);
            }
        }
        return setH0;
    }

    public AbstractC3198g(Context context, Looper looper, AbstractC3199h abstractC3199h, e eVar, int i8, C3195d c3195d, InterfaceC3103d interfaceC3103d, InterfaceC3109j interfaceC3109j) {
        super(context, looper, abstractC3199h, eVar, i8, interfaceC3103d == null ? null : new E(interfaceC3103d), interfaceC3109j != null ? new F(interfaceC3109j) : null, c3195d.h());
        this.f39208F = c3195d;
        this.f39210H = c3195d.a();
        this.f39209G = i0(c3195d.c());
    }
}
