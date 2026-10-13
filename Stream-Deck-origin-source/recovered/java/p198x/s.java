package p198x;

import F1.c;
import K.n;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import p166t.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f37163b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y4.a f37164a = c.a(new c.InterfaceC0112c() { // from class: x.r
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return s.a.a(this.f37161a, aVar);
            }
        });

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a f37165b;

        public static /* synthetic */ Object a(a aVar, c.a aVar2) {
            aVar.f37165b = aVar2;
            return "RequestCompleteListener[" + aVar + "]";
        }

        public final void b() {
            c.a aVar = this.f37165b;
            if (aVar != null) {
                aVar.c(null);
                this.f37165b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i8) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i8, long j8) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j9) {
            b();
        }
    }

    public s(boolean z8) {
        this.f37162a = z8;
    }

    public static /* synthetic */ void a(s sVar, a aVar, Y4.a aVar2) {
        sVar.getClass();
        Log.d("RequestMonitor", "RequestListener " + aVar + " done " + sVar);
        sVar.f37163b.remove(aVar2);
    }

    public static /* synthetic */ Void b(List list) {
        return null;
    }

    public final CameraCaptureSession.CaptureCallback c() {
        final a aVar = new a();
        final Y4.a aVar2 = aVar.f37164a;
        this.f37163b.add(aVar2);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        aVar2.a(new Runnable() { // from class: x.p
            @Override // java.lang.Runnable
            public final void run() {
                s.a(this.f37158a, aVar, aVar2);
            }
        }, J.a.a());
        return aVar;
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        return f() ? Z.b(c(), captureCallback) : captureCallback;
    }

    public Y4.a e() {
        return this.f37163b.isEmpty() ? n.p(null) : n.s(n.x(n.w(new ArrayList(this.f37163b)), new p142q.a() { // from class: x.q
            @Override // p142q.a
            public final Object apply(Object obj) {
                return s.b((List) obj);
            }
        }, J.a.a()));
    }

    public boolean f() {
        return this.f37162a;
    }

    public void g() {
        LinkedList linkedList = new LinkedList(this.f37163b);
        while (!linkedList.isEmpty()) {
            Y4.a aVar = (Y4.a) linkedList.poll();
            Objects.requireNonNull(aVar);
            aVar.cancel(true);
        }
    }
}
