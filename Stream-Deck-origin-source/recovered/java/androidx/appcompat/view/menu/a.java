package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f13601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f13602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f13603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f13604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i.a f13605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f13608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13609j;

    public a(Context context, int i8, int i9) {
        this.f13600a = context;
        this.f13603d = LayoutInflater.from(context);
        this.f13606g = i8;
        this.f13607h = i9;
    }

    public void a(View view, int i8) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f13608i).addView(view, i8);
    }

    public abstract void b(g gVar, j.a aVar);

    @Override // androidx.appcompat.view.menu.i
    public void c(e eVar, boolean z8) {
        i.a aVar = this.f13605f;
        if (aVar != null) {
            aVar.c(eVar, z8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void d(boolean z8) {
        ViewGroup viewGroup = (ViewGroup) this.f13608i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f13602c;
        int i8 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList arrayListE = this.f13602c.E();
            int size = arrayListE.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) arrayListE.get(i10);
                if (q(i9, gVar)) {
                    View childAt = viewGroup.getChildAt(i9);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i9);
                    }
                    i9++;
                }
            }
            i8 = i9;
        }
        while (i8 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i8)) {
                i8++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void h(i.a aVar) {
        this.f13605f = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        this.f13601b = context;
        this.f13604e = LayoutInflater.from(context);
        this.f13602c = eVar;
    }

    public j.a j(ViewGroup viewGroup) {
        return (j.a) this.f13603d.inflate(this.f13607h, viewGroup, false);
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
    @Override // androidx.appcompat.view.menu.i
    public boolean k(l lVar) {
        i.a aVar = this.f13605f;
        e eVar = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            eVar = this.f13602c;
        }
        return aVar.d(eVar);
    }

    public boolean l(ViewGroup viewGroup, int i8) {
        viewGroup.removeViewAt(i8);
        return true;
    }

    public i.a m() {
        return this.f13605f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        j.a aVarJ = view instanceof j.a ? (j.a) view : j(viewGroup);
        b(gVar, aVarJ);
        return (View) aVarJ;
    }

    public j o(ViewGroup viewGroup) {
        if (this.f13608i == null) {
            j jVar = (j) this.f13603d.inflate(this.f13606g, viewGroup, false);
            this.f13608i = jVar;
            jVar.b(this.f13602c);
            d(true);
        }
        return this.f13608i;
    }

    public void p(int i8) {
        this.f13609j = i8;
    }

    public boolean q(int i8, g gVar) {
        return true;
    }
}
