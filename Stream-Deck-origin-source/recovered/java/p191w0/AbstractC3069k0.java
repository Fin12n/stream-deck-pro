package p191w0;

import C6.G;
import R0.C1598l0;
import R0.T0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p011b1.S;
import p017b7.AbstractC1789i;
import p017b7.J;
import p037e0.AbstractC2207c;
import p037e0.i0;
import p038e1.AbstractC2252x;
import p038e1.H;
import p038e1.U;
import p046f0.AbstractC2282j;
import p055g0.B;
import p055g0.P;
import p055g0.v;
import p056g1.InterfaceC2343g;
import p065h1.X;
import p082j0.AbstractC2601e;
import p082j0.AbstractC2604h;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.InterfaceC2605i;
import p082j0.d0;
import p082j0.g0;
import p082j0.h0;
import p110m1.x;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.C3190z;
import p215z0.F0;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.K;
import p215z0.P0;
import p215z0.R0;
import p215z0.g1;
import p215z0.q1;
import p215z0.v1;

/* JADX INFO: renamed from: w0.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3069k0 {

    /* JADX INFO: renamed from: w0.k0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B0 f36079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A1.d f36080b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B0 b8, A1.d dVar) {
            super(0);
            this.f36079a = b8;
            this.f36080b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m284invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m284invoke() {
            this.f36079a.p(this.f36080b);
        }
    }

    /* JADX INFO: renamed from: w0.k0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B0 f36081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f36082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f36083c;

        /* JADX INFO: renamed from: w0.k0$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f36084a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B0 f36085b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(B0 b8, G6.d dVar) {
                super(2, dVar);
                this.f36085b = b8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f36085b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f36084a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    B0 b8 = this.f36085b;
                    this.f36084a = 1;
                    if (b8.m(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: w0.k0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0802b extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f36086a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B0 f36087b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0802b(B0 b8, G6.d dVar) {
                super(2, dVar);
                this.f36087b = b8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0802b(this.f36087b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0802b) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f36086a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    B0 b8 = this.f36087b;
                    this.f36086a = 1;
                    if (b8.k(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: w0.k0$b$c */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f36088a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Function0 function0) {
                super(1);
                this.f36088a = function0;
            }

            public final void b(Throwable th) {
                this.f36088a.invoke();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B0 b8, J j8, Function0 function0) {
            super(0);
            this.f36081a = b8;
            this.f36082b = j8;
            this.f36083c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m285invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m285invoke() {
            if (this.f36081a.f() == C0.Expanded && this.f36081a.h()) {
                AbstractC1789i.d(this.f36082b, null, null, new a(this.f36081a, null), 3, null);
            } else {
                AbstractC1789i.d(this.f36082b, null, null, new C0802b(this.f36081a, null), 3, null).H0(new c(this.f36083c));
            }
        }
    }

    /* JADX INFO: renamed from: w0.k0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f36089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f36090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B0 f36091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L0.i f36092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f36093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Q6.k f36094f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ T0 f36095g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f36096h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f36097i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f36098j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Q6.o f36099k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ J f36100l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Q6.p f36101m;

        /* JADX INFO: renamed from: w0.k0$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f36102a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function0 f36103b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ B0 f36104c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ L0.i f36105d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ float f36106e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Q6.k f36107f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ T0 f36108g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ long f36109h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ long f36110i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ float f36111j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Q6.o f36112k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ J f36113l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Q6.p f36114m;

            /* JADX INFO: renamed from: w0.k0$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0803a extends u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f36115a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0803a(String str) {
                    super(1);
                    this.f36115a = str;
                }

                public final void b(x xVar) {
                    p110m1.u.Q(xVar, this.f36115a);
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((x) obj);
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: w0.k0$c$a$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ B0 f36116a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(B0 b8) {
                    super(1);
                    this.f36116a = b8;
                }

                public final long b(A1.d dVar) {
                    return A1.o.a(0, (int) this.f36116a.o());
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return A1.n.b(b((A1.d) obj));
                }
            }

            /* JADX INFO: renamed from: w0.k0$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0804c extends I6.l implements Q6.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f36117a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ float f36118b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Q6.k f36119c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0804c(Q6.k kVar, G6.d dVar) {
                    super(3, dVar);
                    this.f36119c = kVar;
                }

                public final Object g(J j8, float f8, G6.d dVar) {
                    C0804c c0804c = new C0804c(this.f36119c, dVar);
                    c0804c.f36118b = f8;
                    return c0804c.invokeSuspend(G.f1419a);
                }

                @Override // Q6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return g((J) obj, ((Number) obj2).floatValue(), (G6.d) obj3);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    H6.c.f();
                    if (this.f36117a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                    this.f36119c.invoke(I6.b.c(this.f36118b));
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: w0.k0$c$a$d */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class d extends u implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Q6.o f36120a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B0 f36121b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function0 f36122c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ J f36123d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Q6.p f36124e;

                /* JADX INFO: renamed from: w0.k0$c$a$d$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0805a extends u implements Q6.k {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ B0 f36125a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f36126b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f36127c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f36128d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Function0 f36129e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ J f36130f;

                    /* JADX INFO: renamed from: w0.k0$c$a$d$a$a, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                    public static final class C0806a extends u implements Function0 {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Function0 f36131a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0806a(Function0 function0) {
                            super(0);
                            this.f36131a = function0;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            this.f36131a.invoke();
                            return Boolean.TRUE;
                        }
                    }

                    /* JADX INFO: renamed from: w0.k0$c$a$d$a$b */
                    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                    public static final class b extends u implements Function0 {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ B0 f36132a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ J f36133b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ B0 f36134c;

                        /* JADX INFO: renamed from: w0.k0$c$a$d$a$b$a, reason: collision with other inner class name */
                        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                        public static final class C0807a extends I6.l implements Q6.o {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public int f36135a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ B0 f36136b;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C0807a(B0 b8, G6.d dVar) {
                                super(2, dVar);
                                this.f36136b = b8;
                            }

                            @Override // I6.a
                            public final G6.d create(Object obj, G6.d dVar) {
                                return new C0807a(this.f36136b, dVar);
                            }

                            @Override // Q6.o
                            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(J j8, G6.d dVar) {
                                return ((C0807a) create(j8, dVar)).invokeSuspend(G.f1419a);
                            }

                            @Override // I6.a
                            public final Object invokeSuspend(Object obj) {
                                Object objF = H6.c.f();
                                int i8 = this.f36135a;
                                if (i8 == 0) {
                                    C6.r.b(obj);
                                    B0 b8 = this.f36136b;
                                    this.f36135a = 1;
                                    if (b8.d(this) == objF) {
                                        return objF;
                                    }
                                } else {
                                    if (i8 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C6.r.b(obj);
                                }
                                return G.f1419a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(B0 b8, J j8, B0 b9) {
                            super(0);
                            this.f36132a = b8;
                            this.f36133b = j8;
                            this.f36134c = b9;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            if (((Boolean) this.f36132a.e().r().invoke(C0.Expanded)).booleanValue()) {
                                AbstractC1789i.d(this.f36133b, null, null, new C0807a(this.f36134c, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }
                    }

                    /* JADX INFO: renamed from: w0.k0$c$a$d$a$c, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                    public static final class C0808c extends u implements Function0 {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ B0 f36137a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ J f36138b;

                        /* JADX INFO: renamed from: w0.k0$c$a$d$a$c$a, reason: collision with other inner class name */
                        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                        public static final class C0809a extends I6.l implements Q6.o {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public int f36139a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ B0 f36140b;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C0809a(B0 b8, G6.d dVar) {
                                super(2, dVar);
                                this.f36140b = b8;
                            }

                            @Override // I6.a
                            public final G6.d create(Object obj, G6.d dVar) {
                                return new C0809a(this.f36140b, dVar);
                            }

                            @Override // Q6.o
                            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(J j8, G6.d dVar) {
                                return ((C0809a) create(j8, dVar)).invokeSuspend(G.f1419a);
                            }

                            @Override // I6.a
                            public final Object invokeSuspend(Object obj) {
                                Object objF = H6.c.f();
                                int i8 = this.f36139a;
                                if (i8 == 0) {
                                    C6.r.b(obj);
                                    B0 b8 = this.f36140b;
                                    this.f36139a = 1;
                                    if (b8.m(this) == objF) {
                                        return objF;
                                    }
                                } else {
                                    if (i8 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C6.r.b(obj);
                                }
                                return G.f1419a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0808c(B0 b8, J j8) {
                            super(0);
                            this.f36137a = b8;
                            this.f36138b = j8;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            if (((Boolean) this.f36137a.e().r().invoke(C0.PartiallyExpanded)).booleanValue()) {
                                AbstractC1789i.d(this.f36138b, null, null, new C0809a(this.f36137a, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0805a(B0 b8, String str, String str2, String str3, Function0 function0, J j8) {
                        super(1);
                        this.f36125a = b8;
                        this.f36126b = str;
                        this.f36127c = str2;
                        this.f36128d = str3;
                        this.f36129e = function0;
                        this.f36130f = j8;
                    }

                    public final void b(x xVar) {
                        B0 b8 = this.f36125a;
                        String str = this.f36126b;
                        String str2 = this.f36127c;
                        String str3 = this.f36128d;
                        Function0 function0 = this.f36129e;
                        J j8 = this.f36130f;
                        p110m1.u.l(xVar, str, new C0806a(function0));
                        if (b8.f() == C0.PartiallyExpanded) {
                            p110m1.u.n(xVar, str2, new b(b8, j8, b8));
                        } else if (b8.h()) {
                            p110m1.u.e(xVar, str3, new C0808c(b8, j8));
                        }
                    }

                    @Override // Q6.k
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((x) obj);
                        return G.f1419a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Q6.o oVar, B0 b8, Function0 function0, J j8, Q6.p pVar) {
                    super(2);
                    this.f36120a = oVar;
                    this.f36121b = b8;
                    this.f36122c = function0;
                    this.f36123d = j8;
                    this.f36124e = pVar;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                    Object c0805a;
                    int i9;
                    if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1096570852, i8, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:230)");
                    }
                    L0.i.a aVar = L0.i.f4836a;
                    L0.i iVarH = androidx.compose.foundation.layout.f.h(aVar, 0.0f, 1, null);
                    Q6.o oVar = this.f36120a;
                    B0 b8 = this.f36121b;
                    Function0 function0 = this.f36122c;
                    J j8 = this.f36123d;
                    Q6.p pVar = this.f36124e;
                    interfaceC3163l.f(-483455358);
                    C2598b.l lVarG = C2598b.f27914a.g();
                    L0.c.a aVar2 = L0.c.f4806a;
                    H hA = AbstractC2607k.a(lVarG, aVar2.i(), interfaceC3163l, 0);
                    interfaceC3163l.f(-1323940314);
                    int iA = AbstractC3157i.a(interfaceC3163l, 0);
                    InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                    InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
                    Function0 function0A = aVar3.a();
                    Q6.p pVarB = AbstractC2252x.b(iVarH);
                    if (interfaceC3163l.t() == null) {
                        AbstractC3157i.c();
                    }
                    interfaceC3163l.r();
                    if (interfaceC3163l.m()) {
                        interfaceC3163l.w(function0A);
                    } else {
                        interfaceC3163l.G();
                    }
                    InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
                    v1.b(interfaceC3163lA, hA, aVar3.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE, aVar3.e());
                    Q6.o oVarB = aVar3.b();
                    if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                    interfaceC3163l.f(2058660585);
                    C2609m c2609m = C2609m.f28036a;
                    interfaceC3163l.f(-11289086);
                    if (oVar != null) {
                        D0.a aVar4 = D0.f35229a;
                        String strA = E0.a(D0.a(AbstractC3082r0.f36362a), interfaceC3163l, 0);
                        String strA2 = E0.a(D0.a(AbstractC3082r0.f36363b), interfaceC3163l, 0);
                        String strA3 = E0.a(D0.a(AbstractC3082r0.f36365d), interfaceC3163l, 0);
                        L0.i iVarB = c2609m.b(aVar, aVar2.f());
                        interfaceC3163l.f(-11288530);
                        boolean zR = interfaceC3163l.R(b8) | interfaceC3163l.R(strA2) | interfaceC3163l.R(function0) | interfaceC3163l.R(strA3) | interfaceC3163l.l(j8) | interfaceC3163l.R(strA);
                        Object objG = interfaceC3163l.g();
                        if (zR || objG == InterfaceC3163l.f38803a.a()) {
                            i9 = -1323940314;
                            c0805a = new C0805a(b8, strA2, strA3, strA, function0, j8);
                            interfaceC3163l.H(c0805a);
                        } else {
                            c0805a = objG;
                            i9 = -1323940314;
                        }
                        interfaceC3163l.N();
                        L0.i iVarC = p110m1.n.c(iVarB, true, (Q6.k) c0805a);
                        interfaceC3163l.f(733328855);
                        H hG = AbstractC2601e.g(aVar2.m(), false, interfaceC3163l, 0);
                        interfaceC3163l.f(i9);
                        int iA2 = AbstractC3157i.a(interfaceC3163l, 0);
                        InterfaceC3184w interfaceC3184wE2 = interfaceC3163l.E();
                        Function0 function0A2 = aVar3.a();
                        Q6.p pVarB2 = AbstractC2252x.b(iVarC);
                        if (interfaceC3163l.t() == null) {
                            AbstractC3157i.c();
                        }
                        interfaceC3163l.r();
                        if (interfaceC3163l.m()) {
                            interfaceC3163l.w(function0A2);
                        } else {
                            interfaceC3163l.G();
                        }
                        InterfaceC3163l interfaceC3163lA2 = v1.a(interfaceC3163l);
                        v1.b(interfaceC3163lA2, hG, aVar3.c());
                        v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar3.e());
                        Q6.o oVarB2 = aVar3.b();
                        if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                            interfaceC3163lA2.H(Integer.valueOf(iA2));
                            interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                        }
                        pVarB2.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                        interfaceC3163l.f(2058660585);
                        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
                        oVar.invoke(interfaceC3163l, 0);
                        interfaceC3163l.N();
                        interfaceC3163l.O();
                        interfaceC3163l.N();
                        interfaceC3163l.N();
                    }
                    interfaceC3163l.N();
                    pVar.invoke(c2609m, interfaceC3163l, 6);
                    interfaceC3163l.N();
                    interfaceC3163l.O();
                    interfaceC3163l.N();
                    interfaceC3163l.N();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                }

                @Override // Q6.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j8, Function0 function0, B0 b8, L0.i iVar, float f8, Q6.k kVar, T0 t8, long j9, long j10, float f9, Q6.o oVar, J j11, Q6.p pVar) {
                super(3);
                this.f36102a = j8;
                this.f36103b = function0;
                this.f36104c = b8;
                this.f36105d = iVar;
                this.f36106e = f8;
                this.f36107f = kVar;
                this.f36108g = t8;
                this.f36109h = j9;
                this.f36110i = j10;
                this.f36111j = f9;
                this.f36112k = oVar;
                this.f36113l = j11;
                this.f36114m = pVar;
            }

            public final void b(InterfaceC2605i interfaceC2605i, InterfaceC3163l interfaceC3163l, int i8) {
                int i9;
                if ((i8 & 6) == 0) {
                    i9 = i8 | (interfaceC3163l.R(interfaceC2605i) ? 4 : 2);
                } else {
                    i9 = i8;
                }
                if ((i9 & 19) == 18 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(2008499679, i9, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:184)");
                }
                int iM = A1.b.m(interfaceC2605i.b());
                AbstractC3069k0.d(this.f36102a, this.f36103b, this.f36104c.j() != C0.Hidden, interfaceC3163l, 0);
                D0.a aVar = D0.f35229a;
                String strA = E0.a(D0.a(AbstractC3082r0.f36366e), interfaceC3163l, 0);
                L0.i iVarC = interfaceC2605i.c(androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.f.r(this.f36105d, 0.0f, this.f36106e, 1, null), 0.0f, 1, null), L0.c.f4806a.k());
                interfaceC3163l.f(-1482644208);
                boolean zR = interfaceC3163l.R(strA);
                Object objG = interfaceC3163l.g();
                if (zR || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C0803a(strA);
                    interfaceC3163l.H(objG);
                }
                interfaceC3163l.N();
                L0.i iVarD = p110m1.n.d(iVarC, false, (Q6.k) objG, 1, null);
                interfaceC3163l.f(-1482644143);
                boolean zR2 = interfaceC3163l.R(this.f36104c);
                B0 b8 = this.f36104c;
                Object objG2 = interfaceC3163l.g();
                if (zR2 || objG2 == InterfaceC3163l.f38803a.a()) {
                    objG2 = new b(b8);
                    interfaceC3163l.H(objG2);
                }
                interfaceC3163l.N();
                L0.i iVarA = androidx.compose.foundation.layout.d.a(iVarD, (Q6.k) objG2);
                interfaceC3163l.f(-1482643839);
                boolean zR3 = interfaceC3163l.R(this.f36104c);
                B0 b9 = this.f36104c;
                Q6.k kVar = this.f36107f;
                Object objG3 = interfaceC3163l.g();
                if (zR3 || objG3 == InterfaceC3163l.f38803a.a()) {
                    objG3 = A0.a(b9, B.Vertical, kVar);
                    interfaceC3163l.H(objG3);
                }
                interfaceC3163l.N();
                L0.i iVarB = androidx.compose.ui.input.nestedscroll.a.b(iVarA, (p002a1.a) objG3, null, 2, null);
                v vVarU = this.f36104c.e().u();
                B b10 = B.Vertical;
                boolean zL = this.f36104c.l();
                boolean zY = this.f36104c.e().y();
                interfaceC3163l.f(-1482643097);
                boolean zR4 = interfaceC3163l.R(this.f36107f);
                Q6.k kVar2 = this.f36107f;
                Object objG4 = interfaceC3163l.g();
                if (zR4 || objG4 == InterfaceC3163l.f38803a.a()) {
                    objG4 = new C0804c(kVar2, null);
                    interfaceC3163l.H(objG4);
                }
                interfaceC3163l.N();
                F0.a(AbstractC3069k0.m(p055g0.t.k(iVarB, vVarU, b10, zL, null, zY, null, (Q6.p) objG4, false, 168, null), this.f36104c, iM), this.f36108g, this.f36109h, this.f36110i, this.f36111j, 0.0f, null, H0.c.b(interfaceC3163l, 1096570852, true, new d(this.f36112k, this.f36104c, this.f36103b, this.f36113l, this.f36114m)), interfaceC3163l, 12582912, 96);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((InterfaceC2605i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, Function0 function0, B0 b8, L0.i iVar, float f8, Q6.k kVar, T0 t8, long j9, long j10, float f9, Q6.o oVar, J j11, Q6.p pVar) {
            super(2);
            this.f36089a = j8;
            this.f36090b = function0;
            this.f36091c = b8;
            this.f36092d = iVar;
            this.f36093e = f8;
            this.f36094f = kVar;
            this.f36095g = t8;
            this.f36096h = j9;
            this.f36097i = j10;
            this.f36098j = f9;
            this.f36099k = oVar;
            this.f36100l = j11;
            this.f36101m = pVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1311525899, i8, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:183)");
            }
            AbstractC2604h.a(androidx.compose.foundation.layout.f.f(L0.i.f4836a, 0.0f, 1, null), null, false, H0.c.b(interfaceC3163l, 2008499679, true, new a(this.f36089a, this.f36090b, this.f36091c, this.f36092d, this.f36093e, this.f36094f, this.f36095g, this.f36096h, this.f36097i, this.f36098j, this.f36099k, this.f36100l, this.f36101m)), interfaceC3163l, 3078, 6);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ B0 f36142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(B0 b8, G6.d dVar) {
            super(2, dVar);
            this.f36142b = b8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new d(this.f36142b, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f36141a;
            if (i8 == 0) {
                C6.r.b(obj);
                B0 b8 = this.f36142b;
                this.f36141a = 1;
                if (b8.r(this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f36143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i f36144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B0 f36145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f36146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ T0 f36147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f36148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f36149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f36150h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f36151i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Q6.o f36152j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ d0 f36153k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C3063h0 f36154l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Q6.p f36155m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f36156n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f36157o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f36158p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, L0.i iVar, B0 b8, float f8, T0 t8, long j8, long j9, float f9, long j10, Q6.o oVar, d0 d0Var, C3063h0 c3063h0, Q6.p pVar, int i8, int i9, int i10) {
            super(2);
            this.f36143a = function0;
            this.f36144b = iVar;
            this.f36145c = b8;
            this.f36146d = f8;
            this.f36147e = t8;
            this.f36148f = j8;
            this.f36149g = j9;
            this.f36150h = f9;
            this.f36151i = j10;
            this.f36152j = oVar;
            this.f36153k = d0Var;
            this.f36154l = c3063h0;
            this.f36155m = pVar;
            this.f36156n = i8;
            this.f36157o = i9;
            this.f36158p = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3069k0.a(this.f36143a, this.f36144b, this.f36145c, this.f36146d, this.f36147e, this.f36148f, this.f36149g, this.f36150h, this.f36151i, this.f36152j, this.f36153k, this.f36154l, this.f36155m, interfaceC3163l, F0.a(this.f36156n | 1), F0.a(this.f36157o), this.f36158p);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B0 f36159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f36160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f36161c;

        /* JADX INFO: renamed from: w0.k0$f$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f36162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B0 f36163b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(B0 b8, G6.d dVar) {
                super(2, dVar);
                this.f36163b = b8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f36163b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f36162a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    B0 b8 = this.f36163b;
                    this.f36162a = 1;
                    if (b8.k(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: w0.k0$f$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ B0 f36164a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function0 f36165b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(B0 b8, Function0 function0) {
                super(1);
                this.f36164a = b8;
                this.f36165b = function0;
            }

            public final void b(Throwable th) {
                if (this.f36164a.l()) {
                    return;
                }
                this.f36165b.invoke();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(B0 b8, J j8, Function0 function0) {
            super(0);
            this.f36159a = b8;
            this.f36160b = j8;
            this.f36161c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m286invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m286invoke() {
            if (((Boolean) this.f36159a.e().r().invoke(C0.Hidden)).booleanValue()) {
                AbstractC1789i.d(this.f36160b, null, null, new a(this.f36159a, null), 3, null).H0(new b(this.f36159a, this.f36161c));
            }
        }
    }

    /* JADX INFO: renamed from: w0.k0$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f36166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ B0 f36167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f36168c;

        /* JADX INFO: renamed from: w0.k0$g$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f36169a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B0 f36170b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ float f36171c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(B0 b8, float f8, G6.d dVar) {
                super(2, dVar);
                this.f36170b = b8;
                this.f36171c = f8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f36170b, this.f36171c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f36169a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    B0 b8 = this.f36170b;
                    float f8 = this.f36171c;
                    this.f36169a = 1;
                    if (b8.q(f8, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: w0.k0$g$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ B0 f36172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function0 f36173b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(B0 b8, Function0 function0) {
                super(1);
                this.f36172a = b8;
                this.f36173b = function0;
            }

            public final void b(Throwable th) {
                if (this.f36172a.l()) {
                    return;
                }
                this.f36173b.invoke();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(J j8, B0 b8, Function0 function0) {
            super(1);
            this.f36166a = j8;
            this.f36167b = b8;
            this.f36168c = function0;
        }

        public final void b(float f8) {
            AbstractC1789i.d(this.f36166a, null, null, new a(this.f36167b, f8, null), 3, null).H0(new b(this.f36167b, this.f36168c));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).floatValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3067j0 f36174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A1.t f36175b;

        /* JADX INFO: renamed from: w0.k0$h$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements p215z0.H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3067j0 f36176a;

            public a(ViewTreeObserverOnGlobalLayoutListenerC3067j0 viewTreeObserverOnGlobalLayoutListenerC3067j0) {
                this.f36176a = viewTreeObserverOnGlobalLayoutListenerC3067j0;
            }

            @Override // p215z0.H
            public void d() {
                this.f36176a.e();
                this.f36176a.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ViewTreeObserverOnGlobalLayoutListenerC3067j0 viewTreeObserverOnGlobalLayoutListenerC3067j0, A1.t tVar) {
            super(1);
            this.f36174a = viewTreeObserverOnGlobalLayoutListenerC3067j0;
            this.f36175b = tVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p215z0.H invoke(I i8) {
            this.f36174a.o();
            this.f36174a.p(this.f36175b);
            return new a(this.f36174a);
        }
    }

    /* JADX INFO: renamed from: w0.k0$i */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3063h0 f36177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f36178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f36179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q6.o f36180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f36181e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C3063h0 c3063h0, Function0 function0, d0 d0Var, Q6.o oVar, int i8) {
            super(2);
            this.f36177a = c3063h0;
            this.f36178b = function0;
            this.f36179c = d0Var;
            this.f36180d = oVar;
            this.f36181e = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3069k0.b(this.f36177a, this.f36178b, this.f36179c, this.f36180d, interfaceC3163l, F0.a(this.f36181e | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$j */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f36182a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: renamed from: w0.k0$k */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f36183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1 f36184b;

        /* JADX INFO: renamed from: w0.k0$k$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f36185a = new a();

            public a() {
                super(1);
            }

            public final void b(x xVar) {
                p110m1.u.D(xVar);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(d0 d0Var, q1 q1Var) {
            super(2);
            this.f36183a = d0Var;
            this.f36184b = q1Var;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-114385661, i8, -1, "androidx.compose.material3.ModalBottomSheetPopup.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:452)");
            }
            L0.i iVarA = L0.i.f4836a;
            L0.i iVarC = g0.c(p110m1.n.d(iVarA, false, a.f36185a, 1, null), this.f36183a);
            if (Build.VERSION.SDK_INT >= 33) {
                iVarA = h0.a(iVarA);
            }
            L0.i iVarJ = iVarC.j(iVarA);
            q1 q1Var = this.f36184b;
            interfaceC3163l.f(733328855);
            H hG = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163l, 0);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            Q6.p pVarB = AbstractC2252x.b(iVarJ);
            if (interfaceC3163l.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l.r();
            if (interfaceC3163l.m()) {
                interfaceC3163l.w(function0A);
            } else {
                interfaceC3163l.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
            v1.b(interfaceC3163lA, hG, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            Q6.o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
            AbstractC3069k0.c(q1Var).invoke(interfaceC3163l, 0);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$l */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f36186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1 f36187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j8, q1 q1Var) {
            super(1);
            this.f36186a = j8;
            this.f36187b = q1Var;
        }

        public final void b(T0.f fVar) {
            T0.f.w1(fVar, this.f36186a, 0L, 0L, AbstractC3069k0.e(this.f36187b), null, null, 0, 118, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.f) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$m */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f36188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f36189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f36190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f36191d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(long j8, Function0 function0, boolean z8, int i8) {
            super(2);
            this.f36188a = j8;
            this.f36189b = function0;
            this.f36190c = z8;
            this.f36191d = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3069k0.d(this.f36188a, this.f36189b, this.f36190c, interfaceC3163l, F0.a(this.f36191d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$n */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f36193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f36194c;

        /* JADX INFO: renamed from: w0.k0$n$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f36195a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function0 function0) {
                super(1);
                this.f36195a = function0;
            }

            public final void b(long j8) {
                this.f36195a.invoke();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Q0.f) obj).x());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, G6.d dVar) {
            super(2, dVar);
            this.f36194c = function0;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            n nVar = new n(this.f36194c, dVar);
            nVar.f36193b = obj;
            return nVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p011b1.I i8, G6.d dVar) {
            return ((n) create(i8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f36192a;
            if (i8 == 0) {
                C6.r.b(obj);
                p011b1.I i9 = (p011b1.I) this.f36193b;
                a aVar = new a(this.f36194c);
                this.f36192a = 1;
                if (P.j(i9, null, null, null, aVar, this, 7, null) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$p */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36197a;

        static {
            int[] iArr = new int[E1.p.values().length];
            try {
                iArr[E1.p.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E1.p.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[E1.p.f2155a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36197a = iArr;
        }
    }

    /* JADX INFO: renamed from: w0.k0$q */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B0 f36198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f36199b;

        /* JADX INFO: renamed from: w0.k0$q$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36200a;

            static {
                int[] iArr = new int[C0.values().length];
                try {
                    iArr[C0.Hidden.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C0.PartiallyExpanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C0.Expanded.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f36200a = iArr;
            }
        }

        /* JADX INFO: renamed from: w0.k0$q$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f36201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f36202b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ B0 f36203c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(float f8, long j8, B0 b8) {
                super(1);
                this.f36201a = f8;
                this.f36202b = j8;
                this.f36203c = b8;
            }

            public final void b(E e8) {
                e8.a(C0.Hidden, this.f36201a);
                if (A1.r.f(this.f36202b) > this.f36201a / 2 && !this.f36203c.i()) {
                    e8.a(C0.PartiallyExpanded, this.f36201a / 2.0f);
                }
                if (A1.r.f(this.f36202b) != 0) {
                    e8.a(C0.Expanded, Math.max(0.0f, this.f36201a - A1.r.f(this.f36202b)));
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((E) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(B0 b8, float f8) {
            super(1);
            this.f36198a = b8;
            this.f36199b = f8;
        }

        public final void b(long j8) {
            C0 c8;
            D dA = AbstractC3060g.a(new b(this.f36199b, j8, this.f36198a));
            int i8 = a.f36200a[((C0) this.f36198a.e().x()).ordinal()];
            if (i8 == 1) {
                c8 = C0.Hidden;
            } else {
                if (i8 != 2 && i8 != 3) {
                    throw new C6.m();
                }
                c8 = C0.PartiallyExpanded;
                if (!dA.e(c8)) {
                    c8 = C0.Expanded;
                    if (!dA.e(c8)) {
                        c8 = C0.Hidden;
                    }
                }
            }
            this.f36198a.e().I(dA, c8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((A1.r) obj).j());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.k0$r */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f36204a = new r();

        public r() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C0 c8) {
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0130  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:113:0x013c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x014e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0156  */
    /* JADX WARN: Code duplicated, block: B:124:0x015a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x016e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0175  */
    /* JADX WARN: Code duplicated, block: B:136:0x017a  */
    /* JADX WARN: Code duplicated, block: B:138:0x017e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0186  */
    /* JADX WARN: Code duplicated, block: B:141:0x0189  */
    /* JADX WARN: Code duplicated, block: B:145:0x0196  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:178:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0218  */
    /* JADX WARN: Code duplicated, block: B:180:0x021b  */
    /* JADX WARN: Code duplicated, block: B:183:0x0221  */
    /* JADX WARN: Code duplicated, block: B:184:0x022d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0231  */
    /* JADX WARN: Code duplicated, block: B:187:0x0238  */
    /* JADX WARN: Code duplicated, block: B:190:0x023e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0248  */
    /* JADX WARN: Code duplicated, block: B:194:0x024d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0259  */
    /* JADX WARN: Code duplicated, block: B:198:0x0266  */
    /* JADX WARN: Code duplicated, block: B:200:0x0269  */
    /* JADX WARN: Code duplicated, block: B:203:0x0274  */
    /* JADX WARN: Code duplicated, block: B:204:0x0280  */
    /* JADX WARN: Code duplicated, block: B:206:0x0284  */
    /* JADX WARN: Code duplicated, block: B:207:0x028b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0291  */
    /* JADX WARN: Code duplicated, block: B:211:0x029d  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:215:0x02da  */
    /* JADX WARN: Code duplicated, block: B:218:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:221:0x0317  */
    /* JADX WARN: Code duplicated, block: B:223:0x031d  */
    /* JADX WARN: Code duplicated, block: B:229:0x032f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0337  */
    /* JADX WARN: Code duplicated, block: B:234:0x0360  */
    /* JADX WARN: Code duplicated, block: B:237:0x0385  */
    /* JADX WARN: Code duplicated, block: B:239:0x038b  */
    /* JADX WARN: Code duplicated, block: B:245:0x039c  */
    /* JADX WARN: Code duplicated, block: B:246:0x039e  */
    /* JADX WARN: Code duplicated, block: B:249:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:251:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:254:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:256:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:262:0x03da  */
    /* JADX WARN: Code duplicated, block: B:263:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:266:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:268:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:271:0x0403  */
    /* JADX WARN: Code duplicated, block: B:273:0x0409  */
    /* JADX WARN: Code duplicated, block: B:279:0x0418  */
    /* JADX WARN: Code duplicated, block: B:280:0x041a  */
    /* JADX WARN: Code duplicated, block: B:283:0x0422  */
    /* JADX WARN: Code duplicated, block: B:285:0x0428  */
    /* JADX WARN: Code duplicated, block: B:288:0x0470  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:290:0x047a  */
    /* JADX WARN: Code duplicated, block: B:292:0x0480  */
    /* JADX WARN: Code duplicated, block: B:298:0x048d  */
    /* JADX WARN: Code duplicated, block: B:300:0x0493  */
    /* JADX WARN: Code duplicated, block: B:304:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:308:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(Function0 function0, L0.i iVar, B0 b8, float f8, T0 t8, long j8, long j9, float f9, long j10, Q6.o oVar, d0 d0Var, C3063h0 c3063h0, Q6.p pVar, InterfaceC3163l interfaceC3163l, int i8, int i9, int i10) {
        int i11;
        B0 b0N;
        int i12;
        int i13;
        T0 t0D;
        long jB;
        long j11;
        int i14;
        float fC;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Q6.p pVar2;
        int i21;
        L0.i iVar2;
        float f10;
        int i22;
        long jC;
        long jE;
        Q6.o oVarA;
        d0 d0VarG;
        int i23;
        int i24;
        float f11;
        C3063h0 c3063h0B;
        L0.i iVar3;
        long j12;
        Q6.o oVar2;
        T0 t9;
        long j13;
        float f12;
        long j14;
        int i25;
        A1.d dVar;
        int i26;
        boolean zR;
        Object objG;
        Object objG2;
        InterfaceC3163l.a aVar;
        J jA;
        int i27;
        boolean z8;
        boolean z9;
        Object objG3;
        boolean z10;
        boolean z11;
        Object objG4;
        boolean z12;
        boolean z13;
        Object objG5;
        InterfaceC3163l interfaceC3163l2;
        C3063h0 c3063h1;
        B0 b9;
        long j15;
        L0.i iVar4;
        float f13;
        T0 t10;
        long j16;
        float f14;
        Q6.o oVar3;
        boolean z14;
        Object objG6;
        P0 p0V;
        int i28;
        int i29;
        int i30;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(944867294);
        if ((i10 & 1) != 0) {
            i11 = i8 | 6;
        } else if ((i8 & 6) == 0) {
            i11 = (interfaceC3163lP.l(function0) ? 4 : 2) | i8;
        } else {
            i11 = i8;
        }
        int i31 = i10 & 2;
        if (i31 == 0) {
            if ((i8 & 48) == 0) {
                i11 |= interfaceC3163lP.R(iVar) ? 32 : 16;
            }
            if ((i8 & 384) == 0) {
                if ((i10 & 4) == 0) {
                    b0N = b8;
                    int i32 = interfaceC3163lP.R(b0N) ? 256 : 128;
                    i11 |= i32;
                } else {
                    b0N = b8;
                }
                i11 |= i32;
            } else {
                b0N = b8;
            }
            i12 = i10 & 8;
            if (i12 != 0) {
                if ((i8 & 3072) == 0) {
                    if (interfaceC3163lP.h(f8)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i11 |= i13;
                }
                if ((i8 & 24576) == 0) {
                    if ((i10 & 16) == 0) {
                        t0D = t8;
                        int i33 = interfaceC3163lP.R(t0D) ? 16384 : 8192;
                        i11 |= i33;
                    } else {
                        t0D = t8;
                    }
                    i11 |= i33;
                } else {
                    t0D = t8;
                }
                if ((i8 & 196608) == 0) {
                    jB = j8;
                    if ((i10 & 32) == 0 || !interfaceC3163lP.j(jB)) {
                        i30 = 65536;
                    } else {
                        i30 = 131072;
                    }
                    i11 |= i30;
                } else {
                    jB = j8;
                }
                if ((i8 & 1572864) == 0) {
                    j11 = j9;
                    if ((i10 & 64) == 0 || !interfaceC3163lP.j(j11)) {
                        i29 = 524288;
                    } else {
                        i29 = 1048576;
                    }
                    i11 |= i29;
                } else {
                    j11 = j9;
                }
                i14 = i10 & 128;
                if (i14 != 0) {
                    i11 |= 12582912;
                    fC = f9;
                } else {
                    fC = f9;
                    if ((i8 & 12582912) == 0) {
                        if (interfaceC3163lP.h(fC)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i11 |= i15;
                    }
                }
                if ((i8 & 100663296) == 0) {
                    if ((i10 & 256) == 0) {
                        i28 = i11;
                        int i34 = interfaceC3163lP.j(j10) ? 67108864 : 33554432;
                        i16 = i28 | i34;
                    } else {
                        i28 = i11;
                    }
                    i16 = i28 | i34;
                } else {
                    i16 = i11;
                }
                i17 = i10 & 512;
                if (i17 != 0) {
                    if ((i8 & 805306368) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i16 |= i18;
                    }
                    if ((i9 & 6) == 0) {
                        i19 = i9 | (((i10 & 1024) == 0 || !interfaceC3163lP.R(d0Var)) ? 2 : 4);
                    } else {
                        i19 = i9;
                    }
                    if ((i9 & 48) != 0) {
                        i19 |= ((i10 & 2048) == 0 || !interfaceC3163lP.R(c3063h0)) ? 16 : 32;
                    }
                    i20 = i19;
                    if ((i10 & 4096) != 0) {
                        if ((i9 & 384) == 0) {
                            pVar2 = pVar;
                            if (interfaceC3163lP.l(pVar2)) {
                                i21 = 256;
                            } else {
                                i21 = 128;
                            }
                            i20 |= i21;
                        }
                        if ((306783379 & i16) != 306783378 && (i20 & 147) == 146 && interfaceC3163lP.s()) {
                            interfaceC3163lP.z();
                            iVar4 = iVar;
                            f13 = f8;
                            d0VarG = d0Var;
                            interfaceC3163l2 = interfaceC3163lP;
                            t10 = t0D;
                            j16 = jB;
                            b9 = b0N;
                            f14 = fC;
                            j15 = j10;
                            oVar3 = oVar;
                            c3063h1 = c3063h0;
                        } else {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                                if (i31 != 0) {
                                    iVar2 = L0.i.f4836a;
                                } else {
                                    iVar2 = iVar;
                                }
                                if ((i10 & 4) != 0) {
                                    i16 &= -897;
                                    b0N = n(false, null, interfaceC3163lP, 0, 3);
                                }
                                if (i12 != 0) {
                                    f10 = C3070l.f36205a.f();
                                } else {
                                    f10 = f8;
                                }
                                if ((i10 & 16) != 0) {
                                    i22 = 6;
                                    t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                    i16 &= -57345;
                                } else {
                                    i22 = 6;
                                }
                                if ((i10 & 32) != 0) {
                                    jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                    i16 &= -458753;
                                }
                                if ((i10 & 64) != 0) {
                                    jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                    i16 &= -3670017;
                                } else {
                                    jC = j11;
                                }
                                if (i14 != 0) {
                                    fC = C3070l.f36205a.c();
                                }
                                if ((i10 & 256) != 0) {
                                    jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                    i16 &= -234881025;
                                } else {
                                    jE = j10;
                                }
                                if (i17 != 0) {
                                    oVarA = C3096z.f36716a.a();
                                } else {
                                    oVarA = oVar;
                                }
                                if ((i10 & 1024) != 0) {
                                    d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                    i23 = i20 & (-15);
                                } else {
                                    d0VarG = d0Var;
                                    i23 = i20;
                                }
                                i24 = i23;
                                if ((i10 & 2048) != 0) {
                                    c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                    f11 = f10;
                                    iVar3 = iVar2;
                                    j12 = jC;
                                    oVar2 = oVarA;
                                    t9 = t0D;
                                    j13 = jB;
                                    f12 = fC;
                                    i25 = i24 & (-113);
                                    j14 = jE;
                                } else {
                                    f11 = f10;
                                    c3063h0B = c3063h0;
                                    iVar3 = iVar2;
                                    j12 = jC;
                                    oVar2 = oVarA;
                                    t9 = t0D;
                                    j13 = jB;
                                    f12 = fC;
                                    j14 = jE;
                                    i25 = i24;
                                }
                            } else {
                                interfaceC3163lP.z();
                                if ((i10 & 4) != 0) {
                                    i16 &= -897;
                                }
                                if ((i10 & 16) != 0) {
                                    i16 &= -57345;
                                }
                                if ((i10 & 32) != 0) {
                                    i16 &= -458753;
                                }
                                if ((i10 & 64) != 0) {
                                    i16 &= -3670017;
                                }
                                if ((i10 & 256) != 0) {
                                    i16 &= -234881025;
                                }
                                if ((i10 & 1024) != 0) {
                                    i20 &= -15;
                                }
                                if ((i10 & 2048) != 0) {
                                    i20 &= -113;
                                }
                                iVar3 = iVar;
                                f11 = f8;
                                j14 = j10;
                                oVar2 = oVar;
                                d0VarG = d0Var;
                                i25 = i20;
                                j12 = j11;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                c3063h0B = c3063h0;
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                            }
                            dVar = (A1.d) interfaceC3163lP.e(X.d());
                            interfaceC3163lP.f(-203430466);
                            i26 = (i16 & 896) ^ 384;
                            zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                            objG = interfaceC3163lP.g();
                            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                                objG = new a(b0N, dVar);
                                interfaceC3163lP.H(objG);
                            }
                            interfaceC3163lP.N();
                            K.g((Function0) objG, interfaceC3163lP, 0);
                            interfaceC3163lP.f(773894976);
                            interfaceC3163lP.f(-492369756);
                            objG2 = interfaceC3163lP.g();
                            aVar = InterfaceC3163l.f38803a;
                            if (objG2 == aVar.a()) {
                                C3190z c3190z = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                                interfaceC3163lP.H(c3190z);
                                objG2 = c3190z;
                            }
                            interfaceC3163lP.N();
                            jA = ((C3190z) objG2).a();
                            interfaceC3163lP.N();
                            interfaceC3163lP.f(-203430341);
                            boolean zL = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                            i27 = i16 & 14;
                            if (i27 == 4) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = z8 | zL;
                            objG3 = interfaceC3163lP.g();
                            if (z9 || objG3 == aVar.a()) {
                                objG3 = new f(b0N, jA, function0);
                                interfaceC3163lP.H(objG3);
                            }
                            Function0 function1 = (Function0) objG3;
                            interfaceC3163lP.N();
                            interfaceC3163lP.f(-203430010);
                            boolean zL2 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                            if (i27 == 4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 = zL2 | z10;
                            objG4 = interfaceC3163lP.g();
                            if (z11 || objG4 == aVar.a()) {
                                objG4 = new g(jA, b0N, function0);
                                interfaceC3163lP.H(objG4);
                            }
                            Q6.k kVar = (Q6.k) objG4;
                            interfaceC3163lP.N();
                            interfaceC3163lP.f(-203429778);
                            boolean zL3 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                            if (i27 == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z13 = zL3 | z12;
                            objG5 = interfaceC3163lP.g();
                            if (z13 || objG5 == aVar.a()) {
                                objG5 = new b(b0N, jA, function0);
                                interfaceC3163lP.H(objG5);
                            }
                            interfaceC3163lP.N();
                            C3063h0 c3063h2 = c3063h0B;
                            b(c3063h2, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function1, b0N, iVar3, f11, kVar, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                            interfaceC3163l2 = interfaceC3163lP;
                            if (b0N.g()) {
                                interfaceC3163l2.f(-203424502);
                                z14 = (i26 <= 256 && interfaceC3163l2.R(b0N)) || (i16 & 384) == 256;
                                objG6 = interfaceC3163l2.g();
                                if (z14 || objG6 == aVar.a()) {
                                    objG6 = new d(b0N, null);
                                    interfaceC3163l2.H(objG6);
                                }
                                interfaceC3163l2.N();
                                K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            c3063h1 = c3063h2;
                            b9 = b0N;
                            j15 = j14;
                            iVar4 = iVar3;
                            f13 = f11;
                            t10 = t9;
                            j16 = j13;
                            j11 = j12;
                            f14 = f12;
                            oVar3 = oVar2;
                        }
                        p0V = interfaceC3163l2.v();
                        if (p0V != null) {
                            p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                        }
                    }
                    i20 |= 384;
                    pVar2 = pVar;
                    if ((306783379 & i16) != 306783378) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        } else {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                        }
                        dVar = (A1.d) interfaceC3163lP.e(X.d());
                        interfaceC3163lP.f(-203430466);
                        i26 = (i16 & 896) ^ 384;
                        zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                        objG = interfaceC3163lP.g();
                        if (zR) {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        } else {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        }
                        interfaceC3163lP.N();
                        K.g((Function0) objG, interfaceC3163lP, 0);
                        interfaceC3163lP.f(773894976);
                        interfaceC3163lP.f(-492369756);
                        objG2 = interfaceC3163lP.g();
                        aVar = InterfaceC3163l.f38803a;
                        if (objG2 == aVar.a()) {
                            C3190z c3190z2 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                            interfaceC3163lP.H(c3190z2);
                            objG2 = c3190z2;
                        }
                        interfaceC3163lP.N();
                        jA = ((C3190z) objG2).a();
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430341);
                        boolean zL4 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        i27 = i16 & 14;
                        if (i27 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | zL4;
                        objG3 = interfaceC3163lP.g();
                        if (z9) {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        } else {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        }
                        Function0 function2 = (Function0) objG3;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430010);
                        boolean zL5 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                        if (i27 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zL5 | z10;
                        objG4 = interfaceC3163lP.g();
                        if (z11) {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        } else {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        }
                        Q6.k kVar2 = (Q6.k) objG4;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203429778);
                        boolean zL6 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        if (i27 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zL6 | z12;
                        objG5 = interfaceC3163lP.g();
                        if (z13) {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        } else {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        }
                        interfaceC3163lP.N();
                        C3063h0 c3063h3 = c3063h0B;
                        b(c3063h3, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function2, b0N, iVar3, f11, kVar2, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                        interfaceC3163l2 = interfaceC3163lP;
                        if (b0N.g()) {
                            interfaceC3163l2.f(-203424502);
                            if (i26 <= 256) {
                            }
                            objG6 = interfaceC3163l2.g();
                            if (z14) {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            } else {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            }
                            interfaceC3163l2.N();
                            K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        c3063h1 = c3063h3;
                        b9 = b0N;
                        j15 = j14;
                        iVar4 = iVar3;
                        f13 = f11;
                        t10 = t9;
                        j16 = j13;
                        j11 = j12;
                        f14 = f12;
                        oVar3 = oVar2;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        } else {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                        }
                        dVar = (A1.d) interfaceC3163lP.e(X.d());
                        interfaceC3163lP.f(-203430466);
                        i26 = (i16 & 896) ^ 384;
                        zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                        objG = interfaceC3163lP.g();
                        if (zR) {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        } else {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        }
                        interfaceC3163lP.N();
                        K.g((Function0) objG, interfaceC3163lP, 0);
                        interfaceC3163lP.f(773894976);
                        interfaceC3163lP.f(-492369756);
                        objG2 = interfaceC3163lP.g();
                        aVar = InterfaceC3163l.f38803a;
                        if (objG2 == aVar.a()) {
                            C3190z c3190z3 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                            interfaceC3163lP.H(c3190z3);
                            objG2 = c3190z3;
                        }
                        interfaceC3163lP.N();
                        jA = ((C3190z) objG2).a();
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430341);
                        boolean zL7 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        i27 = i16 & 14;
                        if (i27 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | zL7;
                        objG3 = interfaceC3163lP.g();
                        if (z9) {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        } else {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        }
                        Function0 function3 = (Function0) objG3;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430010);
                        boolean zL8 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                        if (i27 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zL8 | z10;
                        objG4 = interfaceC3163lP.g();
                        if (z11) {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        } else {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        }
                        Q6.k kVar3 = (Q6.k) objG4;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203429778);
                        boolean zL9 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        if (i27 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zL9 | z12;
                        objG5 = interfaceC3163lP.g();
                        if (z13) {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        } else {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        }
                        interfaceC3163lP.N();
                        C3063h0 c3063h4 = c3063h0B;
                        b(c3063h4, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function3, b0N, iVar3, f11, kVar3, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                        interfaceC3163l2 = interfaceC3163lP;
                        if (b0N.g()) {
                            interfaceC3163l2.f(-203424502);
                            if (i26 <= 256) {
                            }
                            objG6 = interfaceC3163l2.g();
                            if (z14) {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            } else {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            }
                            interfaceC3163l2.N();
                            K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        c3063h1 = c3063h4;
                        b9 = b0N;
                        j15 = j14;
                        iVar4 = iVar3;
                        f13 = f11;
                        t10 = t9;
                        j16 = j13;
                        j11 = j12;
                        f14 = f12;
                        oVar3 = oVar2;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                    }
                }
                i16 |= 805306368;
                if ((i9 & 6) == 0) {
                    i19 = i9 | (((i10 & 1024) == 0 || !interfaceC3163lP.R(d0Var)) ? 2 : 4);
                } else {
                    i19 = i9;
                }
                if ((i9 & 48) != 0) {
                    i19 |= ((i10 & 2048) == 0 || !interfaceC3163lP.R(c3063h0)) ? 16 : 32;
                }
                i20 = i19;
                if ((i10 & 4096) != 0) {
                    if ((i9 & 384) == 0) {
                        pVar2 = pVar;
                        if (interfaceC3163lP.l(pVar2)) {
                            i21 = 256;
                        } else {
                            i21 = 128;
                        }
                        i20 |= i21;
                    }
                    if ((306783379 & i16) != 306783378) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        } else {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                        }
                        dVar = (A1.d) interfaceC3163lP.e(X.d());
                        interfaceC3163lP.f(-203430466);
                        i26 = (i16 & 896) ^ 384;
                        zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                        objG = interfaceC3163lP.g();
                        if (zR) {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        } else {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        }
                        interfaceC3163lP.N();
                        K.g((Function0) objG, interfaceC3163lP, 0);
                        interfaceC3163lP.f(773894976);
                        interfaceC3163lP.f(-492369756);
                        objG2 = interfaceC3163lP.g();
                        aVar = InterfaceC3163l.f38803a;
                        if (objG2 == aVar.a()) {
                            C3190z c3190z4 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                            interfaceC3163lP.H(c3190z4);
                            objG2 = c3190z4;
                        }
                        interfaceC3163lP.N();
                        jA = ((C3190z) objG2).a();
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430341);
                        boolean zL10 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        i27 = i16 & 14;
                        if (i27 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | zL10;
                        objG3 = interfaceC3163lP.g();
                        if (z9) {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        } else {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        }
                        Function0 function4 = (Function0) objG3;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430010);
                        boolean zL11 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                        if (i27 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zL11 | z10;
                        objG4 = interfaceC3163lP.g();
                        if (z11) {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        } else {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        }
                        Q6.k kVar4 = (Q6.k) objG4;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203429778);
                        boolean zL12 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        if (i27 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zL12 | z12;
                        objG5 = interfaceC3163lP.g();
                        if (z13) {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        } else {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        }
                        interfaceC3163lP.N();
                        C3063h0 c3063h5 = c3063h0B;
                        b(c3063h5, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function4, b0N, iVar3, f11, kVar4, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                        interfaceC3163l2 = interfaceC3163lP;
                        if (b0N.g()) {
                            interfaceC3163l2.f(-203424502);
                            if (i26 <= 256) {
                            }
                            objG6 = interfaceC3163l2.g();
                            if (z14) {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            } else {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            }
                            interfaceC3163l2.N();
                            K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        c3063h1 = c3063h5;
                        b9 = b0N;
                        j15 = j14;
                        iVar4 = iVar3;
                        f13 = f11;
                        t10 = t9;
                        j16 = j13;
                        j11 = j12;
                        f14 = f12;
                        oVar3 = oVar2;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        } else {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                        }
                        dVar = (A1.d) interfaceC3163lP.e(X.d());
                        interfaceC3163lP.f(-203430466);
                        i26 = (i16 & 896) ^ 384;
                        zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                        objG = interfaceC3163lP.g();
                        if (zR) {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        } else {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        }
                        interfaceC3163lP.N();
                        K.g((Function0) objG, interfaceC3163lP, 0);
                        interfaceC3163lP.f(773894976);
                        interfaceC3163lP.f(-492369756);
                        objG2 = interfaceC3163lP.g();
                        aVar = InterfaceC3163l.f38803a;
                        if (objG2 == aVar.a()) {
                            C3190z c3190z5 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                            interfaceC3163lP.H(c3190z5);
                            objG2 = c3190z5;
                        }
                        interfaceC3163lP.N();
                        jA = ((C3190z) objG2).a();
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430341);
                        boolean zL13 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        i27 = i16 & 14;
                        if (i27 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | zL13;
                        objG3 = interfaceC3163lP.g();
                        if (z9) {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        } else {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        }
                        Function0 function5 = (Function0) objG3;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430010);
                        boolean zL14 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                        if (i27 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zL14 | z10;
                        objG4 = interfaceC3163lP.g();
                        if (z11) {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        } else {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        }
                        Q6.k kVar5 = (Q6.k) objG4;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203429778);
                        boolean zL15 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        if (i27 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zL15 | z12;
                        objG5 = interfaceC3163lP.g();
                        if (z13) {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        } else {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        }
                        interfaceC3163lP.N();
                        C3063h0 c3063h6 = c3063h0B;
                        b(c3063h6, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function5, b0N, iVar3, f11, kVar5, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                        interfaceC3163l2 = interfaceC3163lP;
                        if (b0N.g()) {
                            interfaceC3163l2.f(-203424502);
                            if (i26 <= 256) {
                            }
                            objG6 = interfaceC3163l2.g();
                            if (z14) {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            } else {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            }
                            interfaceC3163l2.N();
                            K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        c3063h1 = c3063h6;
                        b9 = b0N;
                        j15 = j14;
                        iVar4 = iVar3;
                        f13 = f11;
                        t10 = t9;
                        j16 = j13;
                        j11 = j12;
                        f14 = f12;
                        oVar3 = oVar2;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                    }
                }
                i20 |= 384;
                pVar2 = pVar;
                if ((306783379 & i16) != 306783378) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z6 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z6);
                        objG2 = c3190z6;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL16 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL16;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function6 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL17 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL17 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar6 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL18 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL18 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h7 = c3063h0B;
                    b(c3063h7, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function6, b0N, iVar3, f11, kVar6, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h7;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z7 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z7);
                        objG2 = c3190z7;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL19 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL19;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function7 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL110 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL110 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar7 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL111 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL111 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h8 = c3063h0B;
                    b(c3063h8, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function7, b0N, iVar3, f11, kVar7, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h8;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                }
            }
            i11 |= 3072;
            if ((i8 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    t0D = t8;
                    if (interfaceC3163lP.R(t0D)) {
                    }
                    i11 |= i33;
                } else {
                    t0D = t8;
                }
                i11 |= i33;
            } else {
                t0D = t8;
            }
            if ((i8 & 196608) == 0) {
                jB = j8;
                if ((i10 & 32) == 0) {
                    i30 = 65536;
                } else {
                    i30 = 65536;
                }
                i11 |= i30;
            } else {
                jB = j8;
            }
            if ((i8 & 1572864) == 0) {
                j11 = j9;
                if ((i10 & 64) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i11 |= i29;
            } else {
                j11 = j9;
            }
            i14 = i10 & 128;
            if (i14 != 0) {
                i11 |= 12582912;
                fC = f9;
            } else {
                fC = f9;
                if ((i8 & 12582912) == 0) {
                    if (interfaceC3163lP.h(fC)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i11 |= i15;
                }
            }
            if ((i8 & 100663296) == 0) {
                if ((i10 & 256) == 0) {
                    i28 = i11;
                    if (interfaceC3163lP.j(j10)) {
                    }
                    i16 = i28 | i34;
                } else {
                    i28 = i11;
                }
                i16 = i28 | i34;
            } else {
                i16 = i11;
            }
            i17 = i10 & 512;
            if (i17 != 0) {
                if ((i8 & 805306368) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((i9 & 6) == 0) {
                    i19 = i9 | (((i10 & 1024) == 0 || !interfaceC3163lP.R(d0Var)) ? 2 : 4);
                } else {
                    i19 = i9;
                }
                if ((i9 & 48) != 0) {
                    i19 |= ((i10 & 2048) == 0 || !interfaceC3163lP.R(c3063h0)) ? 16 : 32;
                }
                i20 = i19;
                if ((i10 & 4096) != 0) {
                    if ((i9 & 384) == 0) {
                        pVar2 = pVar;
                        if (interfaceC3163lP.l(pVar2)) {
                            i21 = 256;
                        } else {
                            i21 = 128;
                        }
                        i20 |= i21;
                    }
                    if ((306783379 & i16) != 306783378) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        } else {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                        }
                        dVar = (A1.d) interfaceC3163lP.e(X.d());
                        interfaceC3163lP.f(-203430466);
                        i26 = (i16 & 896) ^ 384;
                        zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                        objG = interfaceC3163lP.g();
                        if (zR) {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        } else {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        }
                        interfaceC3163lP.N();
                        K.g((Function0) objG, interfaceC3163lP, 0);
                        interfaceC3163lP.f(773894976);
                        interfaceC3163lP.f(-492369756);
                        objG2 = interfaceC3163lP.g();
                        aVar = InterfaceC3163l.f38803a;
                        if (objG2 == aVar.a()) {
                            C3190z c3190z8 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                            interfaceC3163lP.H(c3190z8);
                            objG2 = c3190z8;
                        }
                        interfaceC3163lP.N();
                        jA = ((C3190z) objG2).a();
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430341);
                        boolean zL112 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        i27 = i16 & 14;
                        if (i27 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | zL112;
                        objG3 = interfaceC3163lP.g();
                        if (z9) {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        } else {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        }
                        Function0 function8 = (Function0) objG3;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430010);
                        boolean zL113 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                        if (i27 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zL113 | z10;
                        objG4 = interfaceC3163lP.g();
                        if (z11) {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        } else {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        }
                        Q6.k kVar8 = (Q6.k) objG4;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203429778);
                        boolean zL114 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        if (i27 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zL114 | z12;
                        objG5 = interfaceC3163lP.g();
                        if (z13) {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        } else {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        }
                        interfaceC3163lP.N();
                        C3063h0 c3063h9 = c3063h0B;
                        b(c3063h9, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function8, b0N, iVar3, f11, kVar8, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                        interfaceC3163l2 = interfaceC3163lP;
                        if (b0N.g()) {
                            interfaceC3163l2.f(-203424502);
                            if (i26 <= 256) {
                            }
                            objG6 = interfaceC3163l2.g();
                            if (z14) {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            } else {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            }
                            interfaceC3163l2.N();
                            K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        c3063h1 = c3063h9;
                        b9 = b0N;
                        j15 = j14;
                        iVar4 = iVar3;
                        f13 = f11;
                        t10 = t9;
                        j16 = j13;
                        j11 = j12;
                        f14 = f12;
                        oVar3 = oVar2;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        } else {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                        }
                        dVar = (A1.d) interfaceC3163lP.e(X.d());
                        interfaceC3163lP.f(-203430466);
                        i26 = (i16 & 896) ^ 384;
                        zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                        objG = interfaceC3163lP.g();
                        if (zR) {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        } else {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        }
                        interfaceC3163lP.N();
                        K.g((Function0) objG, interfaceC3163lP, 0);
                        interfaceC3163lP.f(773894976);
                        interfaceC3163lP.f(-492369756);
                        objG2 = interfaceC3163lP.g();
                        aVar = InterfaceC3163l.f38803a;
                        if (objG2 == aVar.a()) {
                            C3190z c3190z9 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                            interfaceC3163lP.H(c3190z9);
                            objG2 = c3190z9;
                        }
                        interfaceC3163lP.N();
                        jA = ((C3190z) objG2).a();
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430341);
                        boolean zL115 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        i27 = i16 & 14;
                        if (i27 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | zL115;
                        objG3 = interfaceC3163lP.g();
                        if (z9) {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        } else {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        }
                        Function0 function9 = (Function0) objG3;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430010);
                        boolean zL116 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                        if (i27 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zL116 | z10;
                        objG4 = interfaceC3163lP.g();
                        if (z11) {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        } else {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        }
                        Q6.k kVar9 = (Q6.k) objG4;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203429778);
                        boolean zL117 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        if (i27 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zL117 | z12;
                        objG5 = interfaceC3163lP.g();
                        if (z13) {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        } else {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        }
                        interfaceC3163lP.N();
                        C3063h0 c3063h10 = c3063h0B;
                        b(c3063h10, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function9, b0N, iVar3, f11, kVar9, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                        interfaceC3163l2 = interfaceC3163lP;
                        if (b0N.g()) {
                            interfaceC3163l2.f(-203424502);
                            if (i26 <= 256) {
                            }
                            objG6 = interfaceC3163l2.g();
                            if (z14) {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            } else {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            }
                            interfaceC3163l2.N();
                            K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        c3063h1 = c3063h10;
                        b9 = b0N;
                        j15 = j14;
                        iVar4 = iVar3;
                        f13 = f11;
                        t10 = t9;
                        j16 = j13;
                        j11 = j12;
                        f14 = f12;
                        oVar3 = oVar2;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                    }
                }
                i20 |= 384;
                pVar2 = pVar;
                if ((306783379 & i16) != 306783378) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z10 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z10);
                        objG2 = c3190z10;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL118 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL118;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function10 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL119 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL119 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar10 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL1110 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL1110 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h11 = c3063h0B;
                    b(c3063h11, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function10, b0N, iVar3, f11, kVar10, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h11;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z11 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z11);
                        objG2 = c3190z11;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL1111 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL1111;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function11 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL1112 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL1112 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar11 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL1113 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL1113 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h12 = c3063h0B;
                    b(c3063h12, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function11, b0N, iVar3, f11, kVar11, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h12;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                }
            }
            i16 |= 805306368;
            if ((i9 & 6) == 0) {
                i19 = i9 | (((i10 & 1024) == 0 || !interfaceC3163lP.R(d0Var)) ? 2 : 4);
            } else {
                i19 = i9;
            }
            if ((i9 & 48) != 0) {
                i19 |= ((i10 & 2048) == 0 || !interfaceC3163lP.R(c3063h0)) ? 16 : 32;
            }
            i20 = i19;
            if ((i10 & 4096) != 0) {
                if ((i9 & 384) == 0) {
                    pVar2 = pVar;
                    if (interfaceC3163lP.l(pVar2)) {
                        i21 = 256;
                    } else {
                        i21 = 128;
                    }
                    i20 |= i21;
                }
                if ((306783379 & i16) != 306783378) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z12 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z12);
                        objG2 = c3190z12;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL1114 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL1114;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function12 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL1115 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL1115 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar12 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL1116 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL1116 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h13 = c3063h0B;
                    b(c3063h13, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function12, b0N, iVar3, f11, kVar12, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h13;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z13 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z13);
                        objG2 = c3190z13;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL1117 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL1117;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function13 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL1118 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL1118 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar13 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL1119 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL1119 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h14 = c3063h0B;
                    b(c3063h14, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function13, b0N, iVar3, f11, kVar13, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h14;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                }
            }
            i20 |= 384;
            pVar2 = pVar;
            if ((306783379 & i16) != 306783378) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                } else {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                }
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-203430466);
                i26 = (i16 & 896) ^ 384;
                zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                K.g((Function0) objG, interfaceC3163lP, 0);
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG2 = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG2 == aVar.a()) {
                    C3190z c3190z14 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z14);
                    objG2 = c3190z14;
                }
                interfaceC3163lP.N();
                jA = ((C3190z) objG2).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430341);
                boolean zL11110 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                i27 = i16 & 14;
                if (i27 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | zL11110;
                objG3 = interfaceC3163lP.g();
                if (z9) {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                } else {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                }
                Function0 function14 = (Function0) objG3;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430010);
                boolean zL11111 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                if (i27 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zL11111 | z10;
                objG4 = interfaceC3163lP.g();
                if (z11) {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                } else {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                }
                Q6.k kVar14 = (Q6.k) objG4;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203429778);
                boolean zL11112 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                if (i27 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zL11112 | z12;
                objG5 = interfaceC3163lP.g();
                if (z13) {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                } else {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                }
                interfaceC3163lP.N();
                C3063h0 c3063h15 = c3063h0B;
                b(c3063h15, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function14, b0N, iVar3, f11, kVar14, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                interfaceC3163l2 = interfaceC3163lP;
                if (b0N.g()) {
                    interfaceC3163l2.f(-203424502);
                    if (i26 <= 256) {
                    }
                    objG6 = interfaceC3163l2.g();
                    if (z14) {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    } else {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    }
                    interfaceC3163l2.N();
                    K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                c3063h1 = c3063h15;
                b9 = b0N;
                j15 = j14;
                iVar4 = iVar3;
                f13 = f11;
                t10 = t9;
                j16 = j13;
                j11 = j12;
                f14 = f12;
                oVar3 = oVar2;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                } else {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                }
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-203430466);
                i26 = (i16 & 896) ^ 384;
                zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                K.g((Function0) objG, interfaceC3163lP, 0);
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG2 = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG2 == aVar.a()) {
                    C3190z c3190z15 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z15);
                    objG2 = c3190z15;
                }
                interfaceC3163lP.N();
                jA = ((C3190z) objG2).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430341);
                boolean zL11113 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                i27 = i16 & 14;
                if (i27 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | zL11113;
                objG3 = interfaceC3163lP.g();
                if (z9) {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                } else {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                }
                Function0 function15 = (Function0) objG3;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430010);
                boolean zL11114 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                if (i27 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zL11114 | z10;
                objG4 = interfaceC3163lP.g();
                if (z11) {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                } else {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                }
                Q6.k kVar15 = (Q6.k) objG4;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203429778);
                boolean zL11115 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                if (i27 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zL11115 | z12;
                objG5 = interfaceC3163lP.g();
                if (z13) {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                } else {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                }
                interfaceC3163lP.N();
                C3063h0 c3063h16 = c3063h0B;
                b(c3063h16, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function15, b0N, iVar3, f11, kVar15, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                interfaceC3163l2 = interfaceC3163lP;
                if (b0N.g()) {
                    interfaceC3163l2.f(-203424502);
                    if (i26 <= 256) {
                    }
                    objG6 = interfaceC3163l2.g();
                    if (z14) {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    } else {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    }
                    interfaceC3163l2.N();
                    K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                c3063h1 = c3063h16;
                b9 = b0N;
                j15 = j14;
                iVar4 = iVar3;
                f13 = f11;
                t10 = t9;
                j16 = j13;
                j11 = j12;
                f14 = f12;
                oVar3 = oVar2;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
            }
        }
        i11 |= 48;
        if ((i8 & 384) == 0) {
            if ((i10 & 4) == 0) {
                b0N = b8;
                if (interfaceC3163lP.R(b0N)) {
                }
                i11 |= i32;
            } else {
                b0N = b8;
            }
            i11 |= i32;
        } else {
            b0N = b8;
        }
        i12 = i10 & 8;
        if (i12 != 0) {
            if ((i8 & 3072) == 0) {
                if (interfaceC3163lP.h(f8)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i11 |= i13;
            }
            if ((i8 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    t0D = t8;
                    if (interfaceC3163lP.R(t0D)) {
                    }
                    i11 |= i33;
                } else {
                    t0D = t8;
                }
                i11 |= i33;
            } else {
                t0D = t8;
            }
            if ((i8 & 196608) == 0) {
                jB = j8;
                if ((i10 & 32) == 0) {
                    i30 = 65536;
                } else {
                    i30 = 65536;
                }
                i11 |= i30;
            } else {
                jB = j8;
            }
            if ((i8 & 1572864) == 0) {
                j11 = j9;
                if ((i10 & 64) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i11 |= i29;
            } else {
                j11 = j9;
            }
            i14 = i10 & 128;
            if (i14 != 0) {
                i11 |= 12582912;
                fC = f9;
            } else {
                fC = f9;
                if ((i8 & 12582912) == 0) {
                    if (interfaceC3163lP.h(fC)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i11 |= i15;
                }
            }
            if ((i8 & 100663296) == 0) {
                if ((i10 & 256) == 0) {
                    i28 = i11;
                    if (interfaceC3163lP.j(j10)) {
                    }
                    i16 = i28 | i34;
                } else {
                    i28 = i11;
                }
                i16 = i28 | i34;
            } else {
                i16 = i11;
            }
            i17 = i10 & 512;
            if (i17 != 0) {
                if ((i8 & 805306368) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((i9 & 6) == 0) {
                    i19 = i9 | (((i10 & 1024) == 0 || !interfaceC3163lP.R(d0Var)) ? 2 : 4);
                } else {
                    i19 = i9;
                }
                if ((i9 & 48) != 0) {
                    i19 |= ((i10 & 2048) == 0 || !interfaceC3163lP.R(c3063h0)) ? 16 : 32;
                }
                i20 = i19;
                if ((i10 & 4096) != 0) {
                    if ((i9 & 384) == 0) {
                        pVar2 = pVar;
                        if (interfaceC3163lP.l(pVar2)) {
                            i21 = 256;
                        } else {
                            i21 = 128;
                        }
                        i20 |= i21;
                    }
                    if ((306783379 & i16) != 306783378) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        } else {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                        }
                        dVar = (A1.d) interfaceC3163lP.e(X.d());
                        interfaceC3163lP.f(-203430466);
                        i26 = (i16 & 896) ^ 384;
                        zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                        objG = interfaceC3163lP.g();
                        if (zR) {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        } else {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        }
                        interfaceC3163lP.N();
                        K.g((Function0) objG, interfaceC3163lP, 0);
                        interfaceC3163lP.f(773894976);
                        interfaceC3163lP.f(-492369756);
                        objG2 = interfaceC3163lP.g();
                        aVar = InterfaceC3163l.f38803a;
                        if (objG2 == aVar.a()) {
                            C3190z c3190z16 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                            interfaceC3163lP.H(c3190z16);
                            objG2 = c3190z16;
                        }
                        interfaceC3163lP.N();
                        jA = ((C3190z) objG2).a();
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430341);
                        boolean zL11116 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        i27 = i16 & 14;
                        if (i27 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | zL11116;
                        objG3 = interfaceC3163lP.g();
                        if (z9) {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        } else {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        }
                        Function0 function16 = (Function0) objG3;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430010);
                        boolean zL11117 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                        if (i27 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zL11117 | z10;
                        objG4 = interfaceC3163lP.g();
                        if (z11) {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        } else {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        }
                        Q6.k kVar16 = (Q6.k) objG4;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203429778);
                        boolean zL11118 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        if (i27 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zL11118 | z12;
                        objG5 = interfaceC3163lP.g();
                        if (z13) {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        } else {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        }
                        interfaceC3163lP.N();
                        C3063h0 c3063h17 = c3063h0B;
                        b(c3063h17, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function16, b0N, iVar3, f11, kVar16, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                        interfaceC3163l2 = interfaceC3163lP;
                        if (b0N.g()) {
                            interfaceC3163l2.f(-203424502);
                            if (i26 <= 256) {
                            }
                            objG6 = interfaceC3163l2.g();
                            if (z14) {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            } else {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            }
                            interfaceC3163l2.N();
                            K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        c3063h1 = c3063h17;
                        b9 = b0N;
                        j15 = j14;
                        iVar4 = iVar3;
                        f13 = f11;
                        t10 = t9;
                        j16 = j13;
                        j11 = j12;
                        f14 = f12;
                        oVar3 = oVar2;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        } else {
                            if (i31 != 0) {
                                iVar2 = L0.i.f4836a;
                            } else {
                                iVar2 = iVar;
                            }
                            if ((i10 & 4) != 0) {
                                i16 &= -897;
                                b0N = n(false, null, interfaceC3163lP, 0, 3);
                            }
                            if (i12 != 0) {
                                f10 = C3070l.f36205a.f();
                            } else {
                                f10 = f8;
                            }
                            if ((i10 & 16) != 0) {
                                i22 = 6;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 &= -57345;
                            } else {
                                i22 = 6;
                            }
                            if ((i10 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                                i16 &= -458753;
                            }
                            if ((i10 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                                i16 &= -3670017;
                            } else {
                                jC = j11;
                            }
                            if (i14 != 0) {
                                fC = C3070l.f36205a.c();
                            }
                            if ((i10 & 256) != 0) {
                                jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                                i16 &= -234881025;
                            } else {
                                jE = j10;
                            }
                            if (i17 != 0) {
                                oVarA = C3096z.f36716a.a();
                            } else {
                                oVarA = oVar;
                            }
                            if ((i10 & 1024) != 0) {
                                d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                                i23 = i20 & (-15);
                            } else {
                                d0VarG = d0Var;
                                i23 = i20;
                            }
                            i24 = i23;
                            if ((i10 & 2048) != 0) {
                                c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                                f11 = f10;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                i25 = i24 & (-113);
                                j14 = jE;
                            } else {
                                f11 = f10;
                                c3063h0B = c3063h0;
                                iVar3 = iVar2;
                                j12 = jC;
                                oVar2 = oVarA;
                                t9 = t0D;
                                j13 = jB;
                                f12 = fC;
                                j14 = jE;
                                i25 = i24;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                        }
                        dVar = (A1.d) interfaceC3163lP.e(X.d());
                        interfaceC3163lP.f(-203430466);
                        i26 = (i16 & 896) ^ 384;
                        zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                        objG = interfaceC3163lP.g();
                        if (zR) {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        } else {
                            objG = new a(b0N, dVar);
                            interfaceC3163lP.H(objG);
                        }
                        interfaceC3163lP.N();
                        K.g((Function0) objG, interfaceC3163lP, 0);
                        interfaceC3163lP.f(773894976);
                        interfaceC3163lP.f(-492369756);
                        objG2 = interfaceC3163lP.g();
                        aVar = InterfaceC3163l.f38803a;
                        if (objG2 == aVar.a()) {
                            C3190z c3190z17 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                            interfaceC3163lP.H(c3190z17);
                            objG2 = c3190z17;
                        }
                        interfaceC3163lP.N();
                        jA = ((C3190z) objG2).a();
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430341);
                        boolean zL11119 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        i27 = i16 & 14;
                        if (i27 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | zL11119;
                        objG3 = interfaceC3163lP.g();
                        if (z9) {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        } else {
                            objG3 = new f(b0N, jA, function0);
                            interfaceC3163lP.H(objG3);
                        }
                        Function0 function17 = (Function0) objG3;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203430010);
                        boolean zL111110 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                        if (i27 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zL111110 | z10;
                        objG4 = interfaceC3163lP.g();
                        if (z11) {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        } else {
                            objG4 = new g(jA, b0N, function0);
                            interfaceC3163lP.H(objG4);
                        }
                        Q6.k kVar17 = (Q6.k) objG4;
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-203429778);
                        boolean zL111111 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                        if (i27 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zL111111 | z12;
                        objG5 = interfaceC3163lP.g();
                        if (z13) {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        } else {
                            objG5 = new b(b0N, jA, function0);
                            interfaceC3163lP.H(objG5);
                        }
                        interfaceC3163lP.N();
                        C3063h0 c3063h18 = c3063h0B;
                        b(c3063h18, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function17, b0N, iVar3, f11, kVar17, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                        interfaceC3163l2 = interfaceC3163lP;
                        if (b0N.g()) {
                            interfaceC3163l2.f(-203424502);
                            if (i26 <= 256) {
                            }
                            objG6 = interfaceC3163l2.g();
                            if (z14) {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            } else {
                                objG6 = new d(b0N, null);
                                interfaceC3163l2.H(objG6);
                            }
                            interfaceC3163l2.N();
                            K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        c3063h1 = c3063h18;
                        b9 = b0N;
                        j15 = j14;
                        iVar4 = iVar3;
                        f13 = f11;
                        t10 = t9;
                        j16 = j13;
                        j11 = j12;
                        f14 = f12;
                        oVar3 = oVar2;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                    }
                }
                i20 |= 384;
                pVar2 = pVar;
                if ((306783379 & i16) != 306783378) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z18 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z18);
                        objG2 = c3190z18;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL111112 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL111112;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function18 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL111113 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL111113 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar18 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL111114 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL111114 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h19 = c3063h0B;
                    b(c3063h19, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function18, b0N, iVar3, f11, kVar18, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h19;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z19 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z19);
                        objG2 = c3190z19;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL111115 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL111115;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function19 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL111116 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL111116 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar19 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL111117 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL111117 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h110 = c3063h0B;
                    b(c3063h110, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function19, b0N, iVar3, f11, kVar19, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h110;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                }
            }
            i16 |= 805306368;
            if ((i9 & 6) == 0) {
                i19 = i9 | (((i10 & 1024) == 0 || !interfaceC3163lP.R(d0Var)) ? 2 : 4);
            } else {
                i19 = i9;
            }
            if ((i9 & 48) != 0) {
                i19 |= ((i10 & 2048) == 0 || !interfaceC3163lP.R(c3063h0)) ? 16 : 32;
            }
            i20 = i19;
            if ((i10 & 4096) != 0) {
                if ((i9 & 384) == 0) {
                    pVar2 = pVar;
                    if (interfaceC3163lP.l(pVar2)) {
                        i21 = 256;
                    } else {
                        i21 = 128;
                    }
                    i20 |= i21;
                }
                if ((306783379 & i16) != 306783378) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z110 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z110);
                        objG2 = c3190z110;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL111118 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL111118;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function110 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL111119 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL111119 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar110 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL1111110 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL1111110 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h111 = c3063h0B;
                    b(c3063h111, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function110, b0N, iVar3, f11, kVar110, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h111;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z111 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z111);
                        objG2 = c3190z111;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL1111111 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL1111111;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function111 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL1111112 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL1111112 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar111 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL1111113 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL1111113 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h112 = c3063h0B;
                    b(c3063h112, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function111, b0N, iVar3, f11, kVar111, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h112;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                }
            }
            i20 |= 384;
            pVar2 = pVar;
            if ((306783379 & i16) != 306783378) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                } else {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                }
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-203430466);
                i26 = (i16 & 896) ^ 384;
                zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                K.g((Function0) objG, interfaceC3163lP, 0);
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG2 = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG2 == aVar.a()) {
                    C3190z c3190z112 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z112);
                    objG2 = c3190z112;
                }
                interfaceC3163lP.N();
                jA = ((C3190z) objG2).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430341);
                boolean zL1111114 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                i27 = i16 & 14;
                if (i27 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | zL1111114;
                objG3 = interfaceC3163lP.g();
                if (z9) {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                } else {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                }
                Function0 function112 = (Function0) objG3;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430010);
                boolean zL1111115 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                if (i27 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zL1111115 | z10;
                objG4 = interfaceC3163lP.g();
                if (z11) {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                } else {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                }
                Q6.k kVar112 = (Q6.k) objG4;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203429778);
                boolean zL1111116 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                if (i27 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zL1111116 | z12;
                objG5 = interfaceC3163lP.g();
                if (z13) {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                } else {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                }
                interfaceC3163lP.N();
                C3063h0 c3063h113 = c3063h0B;
                b(c3063h113, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function112, b0N, iVar3, f11, kVar112, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                interfaceC3163l2 = interfaceC3163lP;
                if (b0N.g()) {
                    interfaceC3163l2.f(-203424502);
                    if (i26 <= 256) {
                    }
                    objG6 = interfaceC3163l2.g();
                    if (z14) {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    } else {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    }
                    interfaceC3163l2.N();
                    K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                c3063h1 = c3063h113;
                b9 = b0N;
                j15 = j14;
                iVar4 = iVar3;
                f13 = f11;
                t10 = t9;
                j16 = j13;
                j11 = j12;
                f14 = f12;
                oVar3 = oVar2;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                } else {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                }
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-203430466);
                i26 = (i16 & 896) ^ 384;
                zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                K.g((Function0) objG, interfaceC3163lP, 0);
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG2 = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG2 == aVar.a()) {
                    C3190z c3190z113 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z113);
                    objG2 = c3190z113;
                }
                interfaceC3163lP.N();
                jA = ((C3190z) objG2).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430341);
                boolean zL1111117 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                i27 = i16 & 14;
                if (i27 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | zL1111117;
                objG3 = interfaceC3163lP.g();
                if (z9) {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                } else {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                }
                Function0 function113 = (Function0) objG3;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430010);
                boolean zL1111118 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                if (i27 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zL1111118 | z10;
                objG4 = interfaceC3163lP.g();
                if (z11) {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                } else {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                }
                Q6.k kVar113 = (Q6.k) objG4;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203429778);
                boolean zL1111119 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                if (i27 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zL1111119 | z12;
                objG5 = interfaceC3163lP.g();
                if (z13) {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                } else {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                }
                interfaceC3163lP.N();
                C3063h0 c3063h114 = c3063h0B;
                b(c3063h114, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function113, b0N, iVar3, f11, kVar113, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                interfaceC3163l2 = interfaceC3163lP;
                if (b0N.g()) {
                    interfaceC3163l2.f(-203424502);
                    if (i26 <= 256) {
                    }
                    objG6 = interfaceC3163l2.g();
                    if (z14) {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    } else {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    }
                    interfaceC3163l2.N();
                    K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                c3063h1 = c3063h114;
                b9 = b0N;
                j15 = j14;
                iVar4 = iVar3;
                f13 = f11;
                t10 = t9;
                j16 = j13;
                j11 = j12;
                f14 = f12;
                oVar3 = oVar2;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
            }
        }
        i11 |= 3072;
        if ((i8 & 24576) == 0) {
            if ((i10 & 16) == 0) {
                t0D = t8;
                if (interfaceC3163lP.R(t0D)) {
                }
                i11 |= i33;
            } else {
                t0D = t8;
            }
            i11 |= i33;
        } else {
            t0D = t8;
        }
        if ((i8 & 196608) == 0) {
            jB = j8;
            if ((i10 & 32) == 0) {
                i30 = 65536;
            } else {
                i30 = 65536;
            }
            i11 |= i30;
        } else {
            jB = j8;
        }
        if ((i8 & 1572864) == 0) {
            j11 = j9;
            if ((i10 & 64) == 0) {
                i29 = 524288;
            } else {
                i29 = 524288;
            }
            i11 |= i29;
        } else {
            j11 = j9;
        }
        i14 = i10 & 128;
        if (i14 != 0) {
            i11 |= 12582912;
            fC = f9;
        } else {
            fC = f9;
            if ((i8 & 12582912) == 0) {
                if (interfaceC3163lP.h(fC)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i11 |= i15;
            }
        }
        if ((i8 & 100663296) == 0) {
            if ((i10 & 256) == 0) {
                i28 = i11;
                if (interfaceC3163lP.j(j10)) {
                }
                i16 = i28 | i34;
            } else {
                i28 = i11;
            }
            i16 = i28 | i34;
        } else {
            i16 = i11;
        }
        i17 = i10 & 512;
        if (i17 != 0) {
            if ((i8 & 805306368) == 0) {
                if (interfaceC3163lP.l(oVar)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
            if ((i9 & 6) == 0) {
                i19 = i9 | (((i10 & 1024) == 0 || !interfaceC3163lP.R(d0Var)) ? 2 : 4);
            } else {
                i19 = i9;
            }
            if ((i9 & 48) != 0) {
                i19 |= ((i10 & 2048) == 0 || !interfaceC3163lP.R(c3063h0)) ? 16 : 32;
            }
            i20 = i19;
            if ((i10 & 4096) != 0) {
                if ((i9 & 384) == 0) {
                    pVar2 = pVar;
                    if (interfaceC3163lP.l(pVar2)) {
                        i21 = 256;
                    } else {
                        i21 = 128;
                    }
                    i20 |= i21;
                }
                if ((306783379 & i16) != 306783378) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z114 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z114);
                        objG2 = c3190z114;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL11111110 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL11111110;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function114 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL11111111 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL11111111 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar114 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL11111112 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL11111112 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h115 = c3063h0B;
                    b(c3063h115, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function114, b0N, iVar3, f11, kVar114, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h115;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    } else {
                        if (i31 != 0) {
                            iVar2 = L0.i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if ((i10 & 4) != 0) {
                            i16 &= -897;
                            b0N = n(false, null, interfaceC3163lP, 0, 3);
                        }
                        if (i12 != 0) {
                            f10 = C3070l.f36205a.f();
                        } else {
                            f10 = f8;
                        }
                        if ((i10 & 16) != 0) {
                            i22 = 6;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 &= -57345;
                        } else {
                            i22 = 6;
                        }
                        if ((i10 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                            i16 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                            i16 &= -3670017;
                        } else {
                            jC = j11;
                        }
                        if (i14 != 0) {
                            fC = C3070l.f36205a.c();
                        }
                        if ((i10 & 256) != 0) {
                            jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                            i16 &= -234881025;
                        } else {
                            jE = j10;
                        }
                        if (i17 != 0) {
                            oVarA = C3096z.f36716a.a();
                        } else {
                            oVarA = oVar;
                        }
                        if ((i10 & 1024) != 0) {
                            d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                            i23 = i20 & (-15);
                        } else {
                            d0VarG = d0Var;
                            i23 = i20;
                        }
                        i24 = i23;
                        if ((i10 & 2048) != 0) {
                            c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                            f11 = f10;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            i25 = i24 & (-113);
                            j14 = jE;
                        } else {
                            f11 = f10;
                            c3063h0B = c3063h0;
                            iVar3 = iVar2;
                            j12 = jC;
                            oVar2 = oVarA;
                            t9 = t0D;
                            j13 = jB;
                            f12 = fC;
                            j14 = jE;
                            i25 = i24;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                    }
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-203430466);
                    i26 = (i16 & 896) ^ 384;
                    zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                    objG = interfaceC3163lP.g();
                    if (zR) {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    } else {
                        objG = new a(b0N, dVar);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.g((Function0) objG, interfaceC3163lP, 0);
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG2 = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG2 == aVar.a()) {
                        C3190z c3190z115 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z115);
                        objG2 = c3190z115;
                    }
                    interfaceC3163lP.N();
                    jA = ((C3190z) objG2).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430341);
                    boolean zL11111113 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    i27 = i16 & 14;
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | zL11111113;
                    objG3 = interfaceC3163lP.g();
                    if (z9) {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    } else {
                        objG3 = new f(b0N, jA, function0);
                        interfaceC3163lP.H(objG3);
                    }
                    Function0 function115 = (Function0) objG3;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203430010);
                    boolean zL11111114 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zL11111114 | z10;
                    objG4 = interfaceC3163lP.g();
                    if (z11) {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    } else {
                        objG4 = new g(jA, b0N, function0);
                        interfaceC3163lP.H(objG4);
                    }
                    Q6.k kVar115 = (Q6.k) objG4;
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-203429778);
                    boolean zL11111115 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                    if (i27 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zL11111115 | z12;
                    objG5 = interfaceC3163lP.g();
                    if (z13) {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    } else {
                        objG5 = new b(b0N, jA, function0);
                        interfaceC3163lP.H(objG5);
                    }
                    interfaceC3163lP.N();
                    C3063h0 c3063h116 = c3063h0B;
                    b(c3063h116, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function115, b0N, iVar3, f11, kVar115, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                    interfaceC3163l2 = interfaceC3163lP;
                    if (b0N.g()) {
                        interfaceC3163l2.f(-203424502);
                        if (i26 <= 256) {
                        }
                        objG6 = interfaceC3163l2.g();
                        if (z14) {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        } else {
                            objG6 = new d(b0N, null);
                            interfaceC3163l2.H(objG6);
                        }
                        interfaceC3163l2.N();
                        K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    c3063h1 = c3063h116;
                    b9 = b0N;
                    j15 = j14;
                    iVar4 = iVar3;
                    f13 = f11;
                    t10 = t9;
                    j16 = j13;
                    j11 = j12;
                    f14 = f12;
                    oVar3 = oVar2;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
                }
            }
            i20 |= 384;
            pVar2 = pVar;
            if ((306783379 & i16) != 306783378) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                } else {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                }
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-203430466);
                i26 = (i16 & 896) ^ 384;
                zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                K.g((Function0) objG, interfaceC3163lP, 0);
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG2 = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG2 == aVar.a()) {
                    C3190z c3190z116 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z116);
                    objG2 = c3190z116;
                }
                interfaceC3163lP.N();
                jA = ((C3190z) objG2).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430341);
                boolean zL11111116 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                i27 = i16 & 14;
                if (i27 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | zL11111116;
                objG3 = interfaceC3163lP.g();
                if (z9) {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                } else {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                }
                Function0 function116 = (Function0) objG3;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430010);
                boolean zL11111117 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                if (i27 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zL11111117 | z10;
                objG4 = interfaceC3163lP.g();
                if (z11) {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                } else {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                }
                Q6.k kVar116 = (Q6.k) objG4;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203429778);
                boolean zL11111118 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                if (i27 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zL11111118 | z12;
                objG5 = interfaceC3163lP.g();
                if (z13) {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                } else {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                }
                interfaceC3163lP.N();
                C3063h0 c3063h117 = c3063h0B;
                b(c3063h117, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function116, b0N, iVar3, f11, kVar116, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                interfaceC3163l2 = interfaceC3163lP;
                if (b0N.g()) {
                    interfaceC3163l2.f(-203424502);
                    if (i26 <= 256) {
                    }
                    objG6 = interfaceC3163l2.g();
                    if (z14) {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    } else {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    }
                    interfaceC3163l2.N();
                    K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                c3063h1 = c3063h117;
                b9 = b0N;
                j15 = j14;
                iVar4 = iVar3;
                f13 = f11;
                t10 = t9;
                j16 = j13;
                j11 = j12;
                f14 = f12;
                oVar3 = oVar2;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                } else {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                }
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-203430466);
                i26 = (i16 & 896) ^ 384;
                zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                K.g((Function0) objG, interfaceC3163lP, 0);
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG2 = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG2 == aVar.a()) {
                    C3190z c3190z117 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z117);
                    objG2 = c3190z117;
                }
                interfaceC3163lP.N();
                jA = ((C3190z) objG2).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430341);
                boolean zL11111119 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                i27 = i16 & 14;
                if (i27 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | zL11111119;
                objG3 = interfaceC3163lP.g();
                if (z9) {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                } else {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                }
                Function0 function117 = (Function0) objG3;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430010);
                boolean zL111111110 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                if (i27 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zL111111110 | z10;
                objG4 = interfaceC3163lP.g();
                if (z11) {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                } else {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                }
                Q6.k kVar117 = (Q6.k) objG4;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203429778);
                boolean zL111111111 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                if (i27 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zL111111111 | z12;
                objG5 = interfaceC3163lP.g();
                if (z13) {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                } else {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                }
                interfaceC3163lP.N();
                C3063h0 c3063h118 = c3063h0B;
                b(c3063h118, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function117, b0N, iVar3, f11, kVar117, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                interfaceC3163l2 = interfaceC3163lP;
                if (b0N.g()) {
                    interfaceC3163l2.f(-203424502);
                    if (i26 <= 256) {
                    }
                    objG6 = interfaceC3163l2.g();
                    if (z14) {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    } else {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    }
                    interfaceC3163l2.N();
                    K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                c3063h1 = c3063h118;
                b9 = b0N;
                j15 = j14;
                iVar4 = iVar3;
                f13 = f11;
                t10 = t9;
                j16 = j13;
                j11 = j12;
                f14 = f12;
                oVar3 = oVar2;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
            }
        }
        i16 |= 805306368;
        if ((i9 & 6) == 0) {
            i19 = i9 | (((i10 & 1024) == 0 || !interfaceC3163lP.R(d0Var)) ? 2 : 4);
        } else {
            i19 = i9;
        }
        if ((i9 & 48) != 0) {
            i19 |= ((i10 & 2048) == 0 || !interfaceC3163lP.R(c3063h0)) ? 16 : 32;
        }
        i20 = i19;
        if ((i10 & 4096) != 0) {
            if ((i9 & 384) == 0) {
                pVar2 = pVar;
                if (interfaceC3163lP.l(pVar2)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i20 |= i21;
            }
            if ((306783379 & i16) != 306783378) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                } else {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                }
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-203430466);
                i26 = (i16 & 896) ^ 384;
                zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                K.g((Function0) objG, interfaceC3163lP, 0);
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG2 = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG2 == aVar.a()) {
                    C3190z c3190z118 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z118);
                    objG2 = c3190z118;
                }
                interfaceC3163lP.N();
                jA = ((C3190z) objG2).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430341);
                boolean zL111111112 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                i27 = i16 & 14;
                if (i27 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | zL111111112;
                objG3 = interfaceC3163lP.g();
                if (z9) {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                } else {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                }
                Function0 function118 = (Function0) objG3;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430010);
                boolean zL111111113 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                if (i27 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zL111111113 | z10;
                objG4 = interfaceC3163lP.g();
                if (z11) {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                } else {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                }
                Q6.k kVar118 = (Q6.k) objG4;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203429778);
                boolean zL111111114 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                if (i27 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zL111111114 | z12;
                objG5 = interfaceC3163lP.g();
                if (z13) {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                } else {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                }
                interfaceC3163lP.N();
                C3063h0 c3063h119 = c3063h0B;
                b(c3063h119, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function118, b0N, iVar3, f11, kVar118, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                interfaceC3163l2 = interfaceC3163lP;
                if (b0N.g()) {
                    interfaceC3163l2.f(-203424502);
                    if (i26 <= 256) {
                    }
                    objG6 = interfaceC3163l2.g();
                    if (z14) {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    } else {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    }
                    interfaceC3163l2.N();
                    K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                c3063h1 = c3063h119;
                b9 = b0N;
                j15 = j14;
                iVar4 = iVar3;
                f13 = f11;
                t10 = t9;
                j16 = j13;
                j11 = j12;
                f14 = f12;
                oVar3 = oVar2;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                } else {
                    if (i31 != 0) {
                        iVar2 = L0.i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i10 & 4) != 0) {
                        i16 &= -897;
                        b0N = n(false, null, interfaceC3163lP, 0, 3);
                    }
                    if (i12 != 0) {
                        f10 = C3070l.f36205a.f();
                    } else {
                        f10 = f8;
                    }
                    if ((i10 & 16) != 0) {
                        i22 = 6;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 &= -57345;
                    } else {
                        i22 = 6;
                    }
                    if ((i10 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                        i16 &= -458753;
                    }
                    if ((i10 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                        i16 &= -3670017;
                    } else {
                        jC = j11;
                    }
                    if (i14 != 0) {
                        fC = C3070l.f36205a.c();
                    }
                    if ((i10 & 256) != 0) {
                        jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                        i16 &= -234881025;
                    } else {
                        jE = j10;
                    }
                    if (i17 != 0) {
                        oVarA = C3096z.f36716a.a();
                    } else {
                        oVarA = oVar;
                    }
                    if ((i10 & 1024) != 0) {
                        d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                        i23 = i20 & (-15);
                    } else {
                        d0VarG = d0Var;
                        i23 = i20;
                    }
                    i24 = i23;
                    if ((i10 & 2048) != 0) {
                        c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                        f11 = f10;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        i25 = i24 & (-113);
                        j14 = jE;
                    } else {
                        f11 = f10;
                        c3063h0B = c3063h0;
                        iVar3 = iVar2;
                        j12 = jC;
                        oVar2 = oVarA;
                        t9 = t0D;
                        j13 = jB;
                        f12 = fC;
                        j14 = jE;
                        i25 = i24;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                }
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-203430466);
                i26 = (i16 & 896) ^ 384;
                zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(b0N, dVar);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                K.g((Function0) objG, interfaceC3163lP, 0);
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG2 = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG2 == aVar.a()) {
                    C3190z c3190z119 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z119);
                    objG2 = c3190z119;
                }
                interfaceC3163lP.N();
                jA = ((C3190z) objG2).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430341);
                boolean zL111111115 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                i27 = i16 & 14;
                if (i27 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | zL111111115;
                objG3 = interfaceC3163lP.g();
                if (z9) {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                } else {
                    objG3 = new f(b0N, jA, function0);
                    interfaceC3163lP.H(objG3);
                }
                Function0 function119 = (Function0) objG3;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203430010);
                boolean zL111111116 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
                if (i27 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zL111111116 | z10;
                objG4 = interfaceC3163lP.g();
                if (z11) {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                } else {
                    objG4 = new g(jA, b0N, function0);
                    interfaceC3163lP.H(objG4);
                }
                Q6.k kVar119 = (Q6.k) objG4;
                interfaceC3163lP.N();
                interfaceC3163lP.f(-203429778);
                boolean zL111111117 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
                if (i27 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zL111111117 | z12;
                objG5 = interfaceC3163lP.g();
                if (z13) {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                } else {
                    objG5 = new b(b0N, jA, function0);
                    interfaceC3163lP.H(objG5);
                }
                interfaceC3163lP.N();
                C3063h0 c3063h1110 = c3063h0B;
                b(c3063h1110, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function119, b0N, iVar3, f11, kVar119, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
                interfaceC3163l2 = interfaceC3163lP;
                if (b0N.g()) {
                    interfaceC3163l2.f(-203424502);
                    if (i26 <= 256) {
                    }
                    objG6 = interfaceC3163l2.g();
                    if (z14) {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    } else {
                        objG6 = new d(b0N, null);
                        interfaceC3163l2.H(objG6);
                    }
                    interfaceC3163l2.N();
                    K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                c3063h1 = c3063h1110;
                b9 = b0N;
                j15 = j14;
                iVar4 = iVar3;
                f13 = f11;
                t10 = t9;
                j16 = j13;
                j11 = j12;
                f14 = f12;
                oVar3 = oVar2;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
            }
        }
        i20 |= 384;
        pVar2 = pVar;
        if ((306783379 & i16) != 306783378) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i31 != 0) {
                    iVar2 = L0.i.f4836a;
                } else {
                    iVar2 = iVar;
                }
                if ((i10 & 4) != 0) {
                    i16 &= -897;
                    b0N = n(false, null, interfaceC3163lP, 0, 3);
                }
                if (i12 != 0) {
                    f10 = C3070l.f36205a.f();
                } else {
                    f10 = f8;
                }
                if ((i10 & 16) != 0) {
                    i22 = 6;
                    t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                    i16 &= -57345;
                } else {
                    i22 = 6;
                }
                if ((i10 & 32) != 0) {
                    jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                    i16 &= -458753;
                }
                if ((i10 & 64) != 0) {
                    jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                    i16 &= -3670017;
                } else {
                    jC = j11;
                }
                if (i14 != 0) {
                    fC = C3070l.f36205a.c();
                }
                if ((i10 & 256) != 0) {
                    jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                    i16 &= -234881025;
                } else {
                    jE = j10;
                }
                if (i17 != 0) {
                    oVarA = C3096z.f36716a.a();
                } else {
                    oVarA = oVar;
                }
                if ((i10 & 1024) != 0) {
                    d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                    i23 = i20 & (-15);
                } else {
                    d0VarG = d0Var;
                    i23 = i20;
                }
                i24 = i23;
                if ((i10 & 2048) != 0) {
                    c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                    f11 = f10;
                    iVar3 = iVar2;
                    j12 = jC;
                    oVar2 = oVarA;
                    t9 = t0D;
                    j13 = jB;
                    f12 = fC;
                    i25 = i24 & (-113);
                    j14 = jE;
                } else {
                    f11 = f10;
                    c3063h0B = c3063h0;
                    iVar3 = iVar2;
                    j12 = jC;
                    oVar2 = oVarA;
                    t9 = t0D;
                    j13 = jB;
                    f12 = fC;
                    j14 = jE;
                    i25 = i24;
                }
            } else {
                if (i31 != 0) {
                    iVar2 = L0.i.f4836a;
                } else {
                    iVar2 = iVar;
                }
                if ((i10 & 4) != 0) {
                    i16 &= -897;
                    b0N = n(false, null, interfaceC3163lP, 0, 3);
                }
                if (i12 != 0) {
                    f10 = C3070l.f36205a.f();
                } else {
                    f10 = f8;
                }
                if ((i10 & 16) != 0) {
                    i22 = 6;
                    t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                    i16 &= -57345;
                } else {
                    i22 = 6;
                }
                if ((i10 & 32) != 0) {
                    jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                    i16 &= -458753;
                }
                if ((i10 & 64) != 0) {
                    jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                    i16 &= -3670017;
                } else {
                    jC = j11;
                }
                if (i14 != 0) {
                    fC = C3070l.f36205a.c();
                }
                if ((i10 & 256) != 0) {
                    jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                    i16 &= -234881025;
                } else {
                    jE = j10;
                }
                if (i17 != 0) {
                    oVarA = C3096z.f36716a.a();
                } else {
                    oVarA = oVar;
                }
                if ((i10 & 1024) != 0) {
                    d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                    i23 = i20 & (-15);
                } else {
                    d0VarG = d0Var;
                    i23 = i20;
                }
                i24 = i23;
                if ((i10 & 2048) != 0) {
                    c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                    f11 = f10;
                    iVar3 = iVar2;
                    j12 = jC;
                    oVar2 = oVarA;
                    t9 = t0D;
                    j13 = jB;
                    f12 = fC;
                    i25 = i24 & (-113);
                    j14 = jE;
                } else {
                    f11 = f10;
                    c3063h0B = c3063h0;
                    iVar3 = iVar2;
                    j12 = jC;
                    oVar2 = oVarA;
                    t9 = t0D;
                    j13 = jB;
                    f12 = fC;
                    j14 = jE;
                    i25 = i24;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
            }
            dVar = (A1.d) interfaceC3163lP.e(X.d());
            interfaceC3163lP.f(-203430466);
            i26 = (i16 & 896) ^ 384;
            zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
            objG = interfaceC3163lP.g();
            if (zR) {
                objG = new a(b0N, dVar);
                interfaceC3163lP.H(objG);
            } else {
                objG = new a(b0N, dVar);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            K.g((Function0) objG, interfaceC3163lP, 0);
            interfaceC3163lP.f(773894976);
            interfaceC3163lP.f(-492369756);
            objG2 = interfaceC3163lP.g();
            aVar = InterfaceC3163l.f38803a;
            if (objG2 == aVar.a()) {
                C3190z c3190z1110 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                interfaceC3163lP.H(c3190z1110);
                objG2 = c3190z1110;
            }
            interfaceC3163lP.N();
            jA = ((C3190z) objG2).a();
            interfaceC3163lP.N();
            interfaceC3163lP.f(-203430341);
            boolean zL111111118 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
            i27 = i16 & 14;
            if (i27 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z8 | zL111111118;
            objG3 = interfaceC3163lP.g();
            if (z9) {
                objG3 = new f(b0N, jA, function0);
                interfaceC3163lP.H(objG3);
            } else {
                objG3 = new f(b0N, jA, function0);
                interfaceC3163lP.H(objG3);
            }
            Function0 function1110 = (Function0) objG3;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-203430010);
            boolean zL111111119 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
            if (i27 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = zL111111119 | z10;
            objG4 = interfaceC3163lP.g();
            if (z11) {
                objG4 = new g(jA, b0N, function0);
                interfaceC3163lP.H(objG4);
            } else {
                objG4 = new g(jA, b0N, function0);
                interfaceC3163lP.H(objG4);
            }
            Q6.k kVar1110 = (Q6.k) objG4;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-203429778);
            boolean zL1111111110 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
            if (i27 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zL1111111110 | z12;
            objG5 = interfaceC3163lP.g();
            if (z13) {
                objG5 = new b(b0N, jA, function0);
                interfaceC3163lP.H(objG5);
            } else {
                objG5 = new b(b0N, jA, function0);
                interfaceC3163lP.H(objG5);
            }
            interfaceC3163lP.N();
            C3063h0 c3063h1111 = c3063h0B;
            b(c3063h1111, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function1110, b0N, iVar3, f11, kVar1110, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
            interfaceC3163l2 = interfaceC3163lP;
            if (b0N.g()) {
                interfaceC3163l2.f(-203424502);
                if (i26 <= 256) {
                }
                objG6 = interfaceC3163l2.g();
                if (z14) {
                    objG6 = new d(b0N, null);
                    interfaceC3163l2.H(objG6);
                } else {
                    objG6 = new d(b0N, null);
                    interfaceC3163l2.H(objG6);
                }
                interfaceC3163l2.N();
                K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            c3063h1 = c3063h1111;
            b9 = b0N;
            j15 = j14;
            iVar4 = iVar3;
            f13 = f11;
            t10 = t9;
            j16 = j13;
            j11 = j12;
            f14 = f12;
            oVar3 = oVar2;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i31 != 0) {
                    iVar2 = L0.i.f4836a;
                } else {
                    iVar2 = iVar;
                }
                if ((i10 & 4) != 0) {
                    i16 &= -897;
                    b0N = n(false, null, interfaceC3163lP, 0, 3);
                }
                if (i12 != 0) {
                    f10 = C3070l.f36205a.f();
                } else {
                    f10 = f8;
                }
                if ((i10 & 16) != 0) {
                    i22 = 6;
                    t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                    i16 &= -57345;
                } else {
                    i22 = 6;
                }
                if ((i10 & 32) != 0) {
                    jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                    i16 &= -458753;
                }
                if ((i10 & 64) != 0) {
                    jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                    i16 &= -3670017;
                } else {
                    jC = j11;
                }
                if (i14 != 0) {
                    fC = C3070l.f36205a.c();
                }
                if ((i10 & 256) != 0) {
                    jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                    i16 &= -234881025;
                } else {
                    jE = j10;
                }
                if (i17 != 0) {
                    oVarA = C3096z.f36716a.a();
                } else {
                    oVarA = oVar;
                }
                if ((i10 & 1024) != 0) {
                    d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                    i23 = i20 & (-15);
                } else {
                    d0VarG = d0Var;
                    i23 = i20;
                }
                i24 = i23;
                if ((i10 & 2048) != 0) {
                    c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                    f11 = f10;
                    iVar3 = iVar2;
                    j12 = jC;
                    oVar2 = oVarA;
                    t9 = t0D;
                    j13 = jB;
                    f12 = fC;
                    i25 = i24 & (-113);
                    j14 = jE;
                } else {
                    f11 = f10;
                    c3063h0B = c3063h0;
                    iVar3 = iVar2;
                    j12 = jC;
                    oVar2 = oVarA;
                    t9 = t0D;
                    j13 = jB;
                    f12 = fC;
                    j14 = jE;
                    i25 = i24;
                }
            } else {
                if (i31 != 0) {
                    iVar2 = L0.i.f4836a;
                } else {
                    iVar2 = iVar;
                }
                if ((i10 & 4) != 0) {
                    i16 &= -897;
                    b0N = n(false, null, interfaceC3163lP, 0, 3);
                }
                if (i12 != 0) {
                    f10 = C3070l.f36205a.f();
                } else {
                    f10 = f8;
                }
                if ((i10 & 16) != 0) {
                    i22 = 6;
                    t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                    i16 &= -57345;
                } else {
                    i22 = 6;
                }
                if ((i10 & 32) != 0) {
                    jB = C3070l.f36205a.b(interfaceC3163lP, i22);
                    i16 &= -458753;
                }
                if ((i10 & 64) != 0) {
                    jC = AbstractC3091w.c(jB, interfaceC3163lP, (i16 >> 15) & 14);
                    i16 &= -3670017;
                } else {
                    jC = j11;
                }
                if (i14 != 0) {
                    fC = C3070l.f36205a.c();
                }
                if ((i10 & 256) != 0) {
                    jE = C3070l.f36205a.e(interfaceC3163lP, 6);
                    i16 &= -234881025;
                } else {
                    jE = j10;
                }
                if (i17 != 0) {
                    oVarA = C3096z.f36716a.a();
                } else {
                    oVarA = oVar;
                }
                if ((i10 & 1024) != 0) {
                    d0VarG = C3070l.f36205a.g(interfaceC3163lP, 6);
                    i23 = i20 & (-15);
                } else {
                    d0VarG = d0Var;
                    i23 = i20;
                }
                i24 = i23;
                if ((i10 & 2048) != 0) {
                    c3063h0B = C3061g0.b(C3061g0.f35892a, null, false, false, 7, null);
                    f11 = f10;
                    iVar3 = iVar2;
                    j12 = jC;
                    oVar2 = oVarA;
                    t9 = t0D;
                    j13 = jB;
                    f12 = fC;
                    i25 = i24 & (-113);
                    j14 = jE;
                } else {
                    f11 = f10;
                    c3063h0B = c3063h0;
                    iVar3 = iVar2;
                    j12 = jC;
                    oVar2 = oVarA;
                    t9 = t0D;
                    j13 = jB;
                    f12 = fC;
                    j14 = jE;
                    i25 = i24;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(944867294, i16, i25, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
            }
            dVar = (A1.d) interfaceC3163lP.e(X.d());
            interfaceC3163lP.f(-203430466);
            i26 = (i16 & 896) ^ 384;
            zR = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.R(dVar);
            objG = interfaceC3163lP.g();
            if (zR) {
                objG = new a(b0N, dVar);
                interfaceC3163lP.H(objG);
            } else {
                objG = new a(b0N, dVar);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            K.g((Function0) objG, interfaceC3163lP, 0);
            interfaceC3163lP.f(773894976);
            interfaceC3163lP.f(-492369756);
            objG2 = interfaceC3163lP.g();
            aVar = InterfaceC3163l.f38803a;
            if (objG2 == aVar.a()) {
                C3190z c3190z1111 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                interfaceC3163lP.H(c3190z1111);
                objG2 = c3190z1111;
            }
            interfaceC3163lP.N();
            jA = ((C3190z) objG2).a();
            interfaceC3163lP.N();
            interfaceC3163lP.f(-203430341);
            boolean zL1111111111 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
            i27 = i16 & 14;
            if (i27 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z8 | zL1111111111;
            objG3 = interfaceC3163lP.g();
            if (z9) {
                objG3 = new f(b0N, jA, function0);
                interfaceC3163lP.H(objG3);
            } else {
                objG3 = new f(b0N, jA, function0);
                interfaceC3163lP.H(objG3);
            }
            Function0 function1111 = (Function0) objG3;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-203430010);
            boolean zL1111111112 = interfaceC3163lP.l(jA) | ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256);
            if (i27 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = zL1111111112 | z10;
            objG4 = interfaceC3163lP.g();
            if (z11) {
                objG4 = new g(jA, b0N, function0);
                interfaceC3163lP.H(objG4);
            } else {
                objG4 = new g(jA, b0N, function0);
                interfaceC3163lP.H(objG4);
            }
            Q6.k kVar1111 = (Q6.k) objG4;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-203429778);
            boolean zL1111111113 = ((i26 <= 256 && interfaceC3163lP.R(b0N)) || (i16 & 384) == 256) | interfaceC3163lP.l(jA);
            if (i27 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zL1111111113 | z12;
            objG5 = interfaceC3163lP.g();
            if (z13) {
                objG5 = new b(b0N, jA, function0);
                interfaceC3163lP.H(objG5);
            } else {
                objG5 = new b(b0N, jA, function0);
                interfaceC3163lP.H(objG5);
            }
            interfaceC3163lP.N();
            C3063h0 c3063h1112 = c3063h0B;
            b(c3063h1112, (Function0) objG5, d0VarG, H0.c.b(interfaceC3163lP, -1311525899, true, new c(j14, function1111, b0N, iVar3, f11, kVar1111, t9, j13, j12, f12, oVar2, jA, pVar2)), interfaceC3163lP, ((i25 << 6) & 896) | ((i25 >> 3) & 14) | 3072);
            interfaceC3163l2 = interfaceC3163lP;
            if (b0N.g()) {
                interfaceC3163l2.f(-203424502);
                if (i26 <= 256) {
                }
                objG6 = interfaceC3163l2.g();
                if (z14) {
                    objG6 = new d(b0N, null);
                    interfaceC3163l2.H(objG6);
                } else {
                    objG6 = new d(b0N, null);
                    interfaceC3163l2.H(objG6);
                }
                interfaceC3163l2.N();
                K.d(b0N, (Q6.o) objG6, interfaceC3163l2, (i16 >> 6) & 14);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            c3063h1 = c3063h1112;
            b9 = b0N;
            j15 = j14;
            iVar4 = iVar3;
            f13 = f11;
            t10 = t9;
            j16 = j13;
            j11 = j12;
            f14 = f12;
            oVar3 = oVar2;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new e(function0, iVar4, b9, f13, t10, j16, j11, f14, j15, oVar3, d0VarG, c3063h1, pVar, i8, i9, i10));
        }
    }

    public static final void b(C3063h0 c3063h0, Function0 function0, d0 d0Var, Q6.o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(738805080);
        if ((i8 & 6) == 0) {
            i9 = (interfaceC3163lP.R(c3063h0) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= interfaceC3163lP.l(function0) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= interfaceC3163lP.R(d0Var) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= interfaceC3163lP.l(oVar) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(738805080, i9, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:436)");
            }
            View view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
            UUID uuid = (UUID) I0.b.b(new Object[0], null, null, j.f36182a, interfaceC3163lP, 3072, 6);
            AbstractC3173q abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
            q1 q1VarP = g1.p(oVar, interfaceC3163lP, (i9 >> 9) & 14);
            A1.t tVar = (A1.t) interfaceC3163lP.e(X.i());
            interfaceC3163lP.f(173201889);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            Object obj = objG;
            if (objG == aVar.a()) {
                ViewTreeObserverOnGlobalLayoutListenerC3067j0 viewTreeObserverOnGlobalLayoutListenerC3067j0 = new ViewTreeObserverOnGlobalLayoutListenerC3067j0(c3063h0, function0, view, uuid);
                viewTreeObserverOnGlobalLayoutListenerC3067j0.n(abstractC3173qD, H0.c.c(-114385661, true, new k(d0Var, q1VarP)));
                interfaceC3163lP.H(viewTreeObserverOnGlobalLayoutListenerC3067j0);
                obj = viewTreeObserverOnGlobalLayoutListenerC3067j0;
            }
            ViewTreeObserverOnGlobalLayoutListenerC3067j0 viewTreeObserverOnGlobalLayoutListenerC3067j1 = (ViewTreeObserverOnGlobalLayoutListenerC3067j0) obj;
            interfaceC3163lP.N();
            interfaceC3163lP.f(173202877);
            boolean zL = interfaceC3163lP.l(viewTreeObserverOnGlobalLayoutListenerC3067j1) | interfaceC3163lP.R(tVar);
            Object objG2 = interfaceC3163lP.g();
            if (zL || objG2 == aVar.a()) {
                objG2 = new h(viewTreeObserverOnGlobalLayoutListenerC3067j1, tVar);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            K.a(viewTreeObserverOnGlobalLayoutListenerC3067j1, (Q6.k) objG2, interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new i(c3063h0, function0, d0Var, oVar, i8));
        }
    }

    public static final Q6.o c(q1 q1Var) {
        return (Q6.o) q1Var.getValue();
    }

    public static final void d(long j8, Function0 function0, boolean z8, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        L0.i iVarA;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1053897700);
        if ((i8 & 6) == 0) {
            i9 = (interfaceC3163lP.j(j8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= interfaceC3163lP.l(function0) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= interfaceC3163lP.c(z8) ? 256 : 128;
        }
        if ((i9 & 147) == 146 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1053897700, i9, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:370)");
            }
            if (j8 != C1598l0.f9405b.e()) {
                int i10 = i9;
                q1 q1VarD = AbstractC2207c.d(z8 ? 1.0f : 0.0f, new i0(0, 0, null, 7, null), 0.0f, null, null, interfaceC3163lP, 48, 28);
                interfaceC3163lP.f(-1858718943);
                if (z8) {
                    L0.i.a aVar = L0.i.f4836a;
                    interfaceC3163lP.f(-1858718859);
                    boolean z9 = (i10 & 112) == 32;
                    Object objG = interfaceC3163lP.g();
                    if (z9 || objG == InterfaceC3163l.f38803a.a()) {
                        objG = new n(function0, null);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    iVarA = p110m1.n.a(S.c(aVar, function0, (Q6.o) objG), o.f36196a);
                } else {
                    iVarA = L0.i.f4836a;
                }
                interfaceC3163lP.N();
                L0.i iVarJ = androidx.compose.foundation.layout.f.f(L0.i.f4836a, 0.0f, 1, null).j(iVarA);
                interfaceC3163lP.f(-1858718531);
                boolean zR = interfaceC3163lP.R(q1VarD) | ((i10 & 14) == 4);
                Object objG2 = interfaceC3163lP.g();
                if (zR || objG2 == InterfaceC3163l.f38803a.a()) {
                    objG2 = new l(j8, q1VarD);
                    interfaceC3163lP.H(objG2);
                }
                interfaceC3163lP.N();
                AbstractC2282j.a(iVarJ, (Q6.k) objG2, interfaceC3163lP, 0);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new m(j8, function0, z8, i8));
        }
    }

    public static final float e(q1 q1Var) {
        return ((Number) q1Var.getValue()).floatValue();
    }

    public static final boolean l(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final L0.i m(L0.i iVar, B0 b8, float f8) {
        return U.a(iVar, new q(b8, f8));
    }

    public static final B0 n(boolean z8, Q6.k kVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-1261794383);
        if ((i9 & 1) != 0) {
            z8 = false;
        }
        boolean z9 = z8;
        if ((i9 & 2) != 0) {
            kVar = r.f36204a;
        }
        Q6.k kVar2 = kVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1261794383, i8, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:363)");
        }
        B0 b0C = A0.c(z9, kVar2, C0.Hidden, false, interfaceC3163l, (i8 & 14) | 384 | (i8 & 112), 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return b0C;
    }

    public static final boolean o(E1.p pVar, boolean z8) {
        int i8 = p.f36197a[pVar.ordinal()];
        if (i8 == 1) {
            return false;
        }
        if (i8 == 2) {
            return true;
        }
        if (i8 == 3) {
            return z8;
        }
        throw new C6.m();
    }

    /* JADX INFO: renamed from: w0.k0$o */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f36196a = new o();

        public o() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }

        public final void b(x xVar) {
        }
    }
}
