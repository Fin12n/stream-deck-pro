package p176u1;

import C6.j;
import C6.k;
import C6.l;
import U1.D;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: u1.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3039x implements InterfaceC3038w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f34481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f34482b = k.a(l.NONE, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f34483c;

    /* JADX INFO: renamed from: u1.x$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = C3039x.this.f34481a.getContext().getSystemService("input_method");
            t.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public C3039x(View view) {
        this.f34481a = view;
        this.f34483c = new D(view);
    }

    @Override // p176u1.InterfaceC3038w
    public void a(int i8, int i9, int i10, int i11) {
        g().updateSelection(this.f34481a, i8, i9, i10, i11);
    }

    @Override // p176u1.InterfaceC3038w
    public boolean b() {
        return g().isActive(this.f34481a);
    }

    @Override // p176u1.InterfaceC3038w
    public void c() {
        g().restartInput(this.f34481a);
    }

    @Override // p176u1.InterfaceC3038w
    public void d() {
        this.f34483c.a();
    }

    @Override // p176u1.InterfaceC3038w
    public void e() {
        this.f34483c.b();
    }

    public final InputMethodManager g() {
        return (InputMethodManager) this.f34482b.getValue();
    }

    @Override // p176u1.InterfaceC3038w
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        g().updateCursorAnchorInfo(this.f34481a, cursorAnchorInfo);
    }

    @Override // p176u1.InterfaceC3038w
    public void updateExtractedText(int i8, ExtractedText extractedText) {
        g().updateExtractedText(this.f34481a, i8, extractedText);
    }
}
