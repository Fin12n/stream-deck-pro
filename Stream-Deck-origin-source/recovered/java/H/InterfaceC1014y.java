package H;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: renamed from: H.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1014y {

    /* JADX INFO: renamed from: H.y$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC1014y {
        public static InterfaceC1014y l() {
            return new a();
        }

        @Override // H.InterfaceC1014y
        public long a() {
            return -1L;
        }

        @Override // H.InterfaceC1014y
        public m1 b() {
            return m1.b();
        }

        @Override // H.InterfaceC1014y
        public EnumC1012x c() {
            return EnumC1012x.UNKNOWN;
        }

        @Override // H.InterfaceC1014y
        public EnumC1010w e() {
            return EnumC1010w.UNKNOWN;
        }

        @Override // H.InterfaceC1014y
        public EnumC1008v f() {
            return EnumC1008v.UNKNOWN;
        }

        @Override // H.InterfaceC1014y
        public EnumC1004t g() {
            return EnumC1004t.UNKNOWN;
        }

        @Override // H.InterfaceC1014y
        public EnumC1002s h() {
            return EnumC1002s.UNKNOWN;
        }

        @Override // H.InterfaceC1014y
        public CaptureResult i() {
            return null;
        }

        @Override // H.InterfaceC1014y
        public r j() {
            return r.UNKNOWN;
        }

        @Override // H.InterfaceC1014y
        public EnumC1006u k() {
            return EnumC1006u.UNKNOWN;
        }
    }

    long a();

    m1 b();

    EnumC1012x c();

    default void d(I.h.b bVar) {
        bVar.g(c());
    }

    EnumC1010w e();

    EnumC1008v f();

    EnumC1004t g();

    EnumC1002s h();

    default CaptureResult i() {
        return null;
    }

    r j();

    EnumC1006u k();
}
