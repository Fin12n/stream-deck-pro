package io.ktor.utils.io.jvm.javaio;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import io.ktor.utils.io.C;
import io.ktor.utils.io.q;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.t;
import p017b7.C1802o0;
import p017b7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p221z6.g f25539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InputStream f25540e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p221z6.g gVar, InputStream inputStream, G6.d dVar) {
            super(2, dVar);
            this.f25539d = gVar;
            this.f25540e = inputStream;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = new a(this.f25539d, this.f25540e, dVar);
            aVar.f25538c = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c8, G6.d dVar) {
            return ((a) create(c8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws IOException {
            byte[] bArr;
            C c8;
            Object objF = H6.c.f();
            int i8 = this.f25537b;
            if (i8 == 0) {
                r.b(obj);
                C c9 = (C) this.f25538c;
                bArr = (byte[]) this.f25539d.b0();
                c8 = c9;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr = (byte[]) this.f25536a;
                c8 = (C) this.f25538c;
                try {
                    r.b(obj);
                } catch (Throwable th) {
                    try {
                        c8.mo220e().d(th);
                        this.f25539d.H1(bArr);
                    } finally {
                        this.f25539d.H1(bArr);
                        this.f25540e.close();
                    }
                }
            }
            while (true) {
                int i9 = this.f25540e.read(bArr, 0, bArr.length);
                if (i9 < 0) {
                    this.f25539d.H1(bArr);
                    return G.f1419a;
                }
                if (i9 != 0) {
                    io.ktor.utils.io.j jVarMo220e = c8.mo220e();
                    this.f25538c = c8;
                    this.f25536a = bArr;
                    this.f25537b = 1;
                    if (jVarMo220e.l(bArr, 0, i9, this) == objF) {
                        return objF;
                    }
                }
            }
        }
    }

    public static final io.ktor.utils.io.g a(InputStream inputStream, G6.g context, p221z6.g pool) {
        t.g(inputStream, "<this>");
        t.g(context, "context");
        t.g(pool, "pool");
        return q.e(C1802o0.f15975a, context, true, new a(pool, inputStream, null)).mo219e();
    }

    public static /* synthetic */ io.ktor.utils.io.g b(InputStream inputStream, G6.g gVar, p221z6.g gVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = Z.b();
        }
        if ((i8 & 2) != 0) {
            gVar2 = p221z6.a.a();
        }
        return a(inputStream, gVar, gVar2);
    }
}
