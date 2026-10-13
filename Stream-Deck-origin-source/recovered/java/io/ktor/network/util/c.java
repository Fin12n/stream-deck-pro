package io.ktor.network.util;

import Q6.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25026a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(p141p6.a.d());
        }
    }

    public static final b a(J j8, String name, long j9, Function0 clock, k onTimeout) {
        t.g(j8, "<this>");
        t.g(name, "name");
        t.g(clock, "clock");
        t.g(onTimeout, "onTimeout");
        return new b(name, j9, clock, j8, onTimeout);
    }

    public static /* synthetic */ b b(J j8, String str, long j9, Function0 function0, k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "";
        }
        if ((i8 & 4) != 0) {
            function0 = a.f25026a;
        }
        return a(j8, str, j9, function0, kVar);
    }
}
