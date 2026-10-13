package androidx.appcompat.view.menu;

import U1.AbstractC1640b;
import U1.M;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e implements N1.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f13664A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f13666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f13669e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f13677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f13678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f13679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f13680p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g f13688x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13690z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13676l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13681q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13682r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13683s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13684t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13685u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f13686v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList f13687w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13689y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f13670f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f13671g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13672h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f13673i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f13674j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13675k = true;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f13665a = context;
        this.f13666b = context.getResources();
        c0(true);
    }

    public static int B(int i8) {
        int i9 = ((-65536) & i8) >> 16;
        if (i9 >= 0) {
            int[] iArr = f13664A;
            if (i9 < iArr.length) {
                return (i8 & 65535) | (iArr[i9] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int n(ArrayList arrayList, int i8) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i8) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.f13684t;
    }

    public Resources C() {
        return this.f13666b;
    }

    public ArrayList E() {
        if (!this.f13672h) {
            return this.f13671g;
        }
        this.f13671g.clear();
        int size = this.f13670f.size();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) this.f13670f.get(i8);
            if (gVar.isVisible()) {
                this.f13671g.add(gVar);
            }
        }
        this.f13672h = false;
        this.f13675k = true;
        return this.f13671g;
    }

    public boolean F() {
        return !this.f13681q;
    }

    public boolean G() {
        return this.f13689y;
    }

    public boolean H() {
        return this.f13667c;
    }

    public boolean I() {
        return this.f13668d;
    }

    public void J(g gVar) {
        this.f13675k = true;
        L(true);
    }

    public void K(g gVar) {
        this.f13672h = true;
        L(true);
    }

    public void L(boolean z8) {
        if (this.f13681q) {
            this.f13682r = true;
            if (z8) {
                this.f13683s = true;
                return;
            }
            return;
        }
        if (z8) {
            this.f13672h = true;
            this.f13675k = true;
        }
        i(z8);
    }

    public boolean M(MenuItem menuItem, int i8) {
        return N(menuItem, null, i8);
    }

    public boolean N(MenuItem menuItem, i iVar, int i8) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        AbstractC1640b abstractC1640bB = gVar.b();
        boolean z8 = abstractC1640bB != null && abstractC1640bB.a();
        if (gVar.j()) {
            boolean zExpandActionView = gVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!gVar.hasSubMenu() && !z8) {
            if ((i8 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i8 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new l(u(), this, gVar));
        }
        l lVar = (l) gVar.getSubMenu();
        if (z8) {
            abstractC1640bB.f(lVar);
        }
        boolean zJ = j(lVar, iVar) | zK;
        if (!zJ) {
            e(true);
        }
        return zJ;
    }

    public final void O(int i8, boolean z8) {
        if (i8 < 0 || i8 >= this.f13670f.size()) {
            return;
        }
        this.f13670f.remove(i8);
        if (z8) {
            L(true);
        }
    }

    public void P(i iVar) {
        for (WeakReference weakReference : this.f13687w) {
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f13687w.remove(weakReference);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).Q(bundle);
            }
        }
        int i9 = bundle.getInt("android:menu:expandedactionview");
        if (i9 <= 0 || (menuItemFindItem = findItem(i9)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.f13669e = aVar;
    }

    public e T(int i8) {
        this.f13676l = i8;
        return this;
    }

    public void U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f13670f.size();
        e0();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) this.f13670f.get(i8);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        d0();
    }

    public e V(int i8) {
        X(0, null, i8, null, null);
        return this;
    }

    public e W(Drawable drawable) {
        X(0, null, 0, drawable, null);
        return this;
    }

    public final void X(int i8, CharSequence charSequence, int i9, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f13680p = view;
            this.f13678n = null;
            this.f13679o = null;
        } else {
            if (i8 > 0) {
                this.f13678n = resourcesC.getText(i8);
            } else if (charSequence != null) {
                this.f13678n = charSequence;
            }
            if (i9 > 0) {
                this.f13679o = I1.a.d(u(), i9);
            } else if (drawable != null) {
                this.f13679o = drawable;
            }
            this.f13680p = null;
        }
        L(false);
    }

    public e Y(int i8) {
        X(i8, null, 0, null, null);
        return this;
    }

    public e Z(CharSequence charSequence) {
        X(0, charSequence, 0, null, null);
        return this;
    }

    public MenuItem a(int i8, int i9, int i10, CharSequence charSequence) {
        int iB = B(i10);
        g gVarG = g(i8, i9, i10, iB, charSequence, this.f13676l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f13677m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f13670f;
        arrayList.add(n(arrayList, iB), gVarG);
        L(true);
        return gVarG;
    }

    public e a0(View view) {
        X(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i8, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        int i12;
        PackageManager packageManager = this.f13665a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i11 & 1) == 0) {
            removeGroup(i8);
        }
        for (int i13 = 0; i13 < size; i13++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i14 < 0 ? intent : intentArr[i14]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i8, i9, i10, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar) {
        c(iVar, this.f13665a);
    }

    public void b0(boolean z8) {
        this.f13690z = z8;
    }

    public void c(i iVar, Context context) {
        this.f13687w.add(new WeakReference(iVar));
        iVar.i(context, this);
        this.f13675k = true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final void c0(boolean z8) {
        boolean z9;
        if (z8) {
            z9 = this.f13666b.getConfiguration().keyboard != 1 && M.j(ViewConfiguration.get(this.f13665a), this.f13665a);
        }
        this.f13668d = z9;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f13688x;
        if (gVar != null) {
            f(gVar);
        }
        this.f13670f.clear();
        L(true);
    }

    public void clearHeader() {
        this.f13679o = null;
        this.f13678n = null;
        this.f13680p = null;
        L(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f13669e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f13681q = false;
        if (this.f13682r) {
            this.f13682r = false;
            L(this.f13683s);
        }
    }

    public final void e(boolean z8) {
        if (this.f13685u) {
            return;
        }
        this.f13685u = true;
        for (WeakReference weakReference : this.f13687w) {
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f13687w.remove(weakReference);
            } else {
                iVar.c(this, z8);
            }
        }
        this.f13685u = false;
    }

    public void e0() {
        if (this.f13681q) {
            return;
        }
        this.f13681q = true;
        this.f13682r = false;
        this.f13683s = false;
    }

    public boolean f(g gVar) {
        boolean zF = false;
        if (!this.f13687w.isEmpty() && this.f13688x == gVar) {
            e0();
            for (WeakReference weakReference : this.f13687w) {
                i iVar = (i) weakReference.get();
                if (iVar != null) {
                    zF = iVar.f(this, gVar);
                    if (zF) {
                        break;
                    }
                } else {
                    this.f13687w.remove(weakReference);
                }
            }
            d0();
            if (zF) {
                this.f13688x = null;
            }
        }
        return zF;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i8) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f13670f.get(i9);
            if (gVar.getItemId() == i8) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i8)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final g g(int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        return new g(this, i8, i9, i10, i11, charSequence, i12);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i8) {
        return (MenuItem) this.f13670f.get(i8);
    }

    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f13669e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f13690z) {
            return true;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((g) this.f13670f.get(i8)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z8) {
        if (this.f13687w.isEmpty()) {
            return;
        }
        e0();
        for (WeakReference weakReference : this.f13687w) {
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f13687w.remove(weakReference);
            } else {
                iVar.d(z8);
            }
        }
        d0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return p(i8, keyEvent) != null;
    }

    public final boolean j(l lVar, i iVar) {
        if (this.f13687w.isEmpty()) {
            return false;
        }
        boolean zK = iVar != null ? iVar.k(lVar) : false;
        for (WeakReference weakReference : this.f13687w) {
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null) {
                this.f13687w.remove(weakReference);
            } else if (!zK) {
                zK = iVar2.k(lVar);
            }
        }
        return zK;
    }

    public boolean k(g gVar) {
        boolean zG = false;
        if (this.f13687w.isEmpty()) {
            return false;
        }
        e0();
        for (WeakReference weakReference : this.f13687w) {
            i iVar = (i) weakReference.get();
            if (iVar != null) {
                zG = iVar.g(this, gVar);
                if (zG) {
                    break;
                }
            } else {
                this.f13687w.remove(weakReference);
            }
        }
        d0();
        if (zG) {
            this.f13688x = gVar;
        }
        return zG;
    }

    public int l(int i8) {
        return m(i8, 0);
    }

    public int m(int i8, int i9) {
        int size = size();
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < size) {
            if (((g) this.f13670f.get(i9)).getGroupId() == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public int o(int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((g) this.f13670f.get(i9)).getItemId() == i8) {
                return i9;
            }
        }
        return -1;
    }

    public g p(int i8, KeyEvent keyEvent) {
        ArrayList arrayList = this.f13686v;
        arrayList.clear();
        q(arrayList, i8, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean zH = H();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) arrayList.get(i9);
            char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zH && alphabeticShortcut == '\b' && i8 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i8, int i9) {
        return M(findItem(i8), i9);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i8, KeyEvent keyEvent, int i9) {
        g gVarP = p(i8, keyEvent);
        boolean zM = gVarP != null ? M(gVarP, i9) : false;
        if ((i9 & 2) != 0) {
            e(true);
        }
        return zM;
    }

    public void q(List list, int i8, KeyEvent keyEvent) {
        boolean zH = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i8 == 67) {
            int size = this.f13670f.size();
            for (int i9 = 0; i9 < size; i9++) {
                g gVar = (g) this.f13670f.get(i9);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i8, keyEvent);
                }
                char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zH ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zH && alphabeticShortcut == '\b' && i8 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList arrayListE = E();
        if (this.f13675k) {
            boolean zE = false;
            for (WeakReference weakReference : this.f13687w) {
                i iVar = (i) weakReference.get();
                if (iVar == null) {
                    this.f13687w.remove(weakReference);
                } else {
                    zE |= iVar.e();
                }
            }
            if (zE) {
                this.f13673i.clear();
                this.f13674j.clear();
                int size = arrayListE.size();
                for (int i8 = 0; i8 < size; i8++) {
                    g gVar = (g) arrayListE.get(i8);
                    if (gVar.l()) {
                        this.f13673i.add(gVar);
                    } else {
                        this.f13674j.add(gVar);
                    }
                }
            } else {
                this.f13673i.clear();
                this.f13674j.clear();
                this.f13674j.addAll(E());
            }
            this.f13675k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i8) {
        int iL = l(i8);
        if (iL >= 0) {
            int size = this.f13670f.size() - iL;
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                if (i9 >= size || ((g) this.f13670f.get(iL)).getGroupId() != i8) {
                    break;
                }
                O(iL, false);
                i9 = i10;
            }
            L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i8) {
        O(o(i8), true);
    }

    public ArrayList s() {
        r();
        return this.f13673i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i8, boolean z8, boolean z9) {
        int size = this.f13670f.size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f13670f.get(i9);
            if (gVar.getGroupId() == i8) {
                gVar.t(z9);
                gVar.setCheckable(z8);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z8) {
        this.f13689y = z8;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i8, boolean z8) {
        int size = this.f13670f.size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f13670f.get(i9);
            if (gVar.getGroupId() == i8) {
                gVar.setEnabled(z8);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i8, boolean z8) {
        int size = this.f13670f.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f13670f.get(i9);
            if (gVar.getGroupId() == i8 && gVar.y(z8)) {
                z9 = true;
            }
        }
        if (z9) {
            L(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.f13667c = z8;
        L(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f13670f.size();
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f13665a;
    }

    public g v() {
        return this.f13688x;
    }

    public Drawable w() {
        return this.f13679o;
    }

    public CharSequence x() {
        return this.f13678n;
    }

    public View y() {
        return this.f13680p;
    }

    public ArrayList z() {
        r();
        return this.f13674j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8) {
        return a(0, 0, 0, this.f13666b.getString(i8));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8) {
        return addSubMenu(0, 0, 0, this.f13666b.getString(i8));
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, CharSequence charSequence) {
        return a(i8, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, CharSequence charSequence) {
        g gVar = (g) a(i8, i9, i10, charSequence);
        l lVar = new l(this.f13665a, this, gVar);
        gVar.x(lVar);
        return lVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, int i11) {
        return a(i8, i9, i10, this.f13666b.getString(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, int i11) {
        return addSubMenu(i8, i9, i10, this.f13666b.getString(i11));
    }

    public e D() {
        return this;
    }
}
