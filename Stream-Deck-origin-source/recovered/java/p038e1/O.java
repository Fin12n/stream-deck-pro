package p038e1;

import java.util.List;
import p056g1.T;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f20429a;

        public a(N n8) {
            this.f20429a = n8;
        }

        @Override // p038e1.H
        public int a(InterfaceC2244o interfaceC2244o, List list, int i8) {
            return this.f20429a.a(interfaceC2244o, T.a(interfaceC2244o), i8);
        }

        @Override // p038e1.H
        public int b(InterfaceC2244o interfaceC2244o, List list, int i8) {
            return this.f20429a.b(interfaceC2244o, T.a(interfaceC2244o), i8);
        }

        @Override // p038e1.H
        public int c(InterfaceC2244o interfaceC2244o, List list, int i8) {
            return this.f20429a.c(interfaceC2244o, T.a(interfaceC2244o), i8);
        }

        @Override // p038e1.H
        public I d(J j8, List list, long j9) {
            return this.f20429a.d(j8, T.a(j8), j9);
        }

        @Override // p038e1.H
        public int e(InterfaceC2244o interfaceC2244o, List list, int i8) {
            return this.f20429a.e(interfaceC2244o, T.a(interfaceC2244o), i8);
        }
    }

    public static final H a(N n8) {
        return new a(n8);
    }
}
