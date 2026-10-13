package p099l;

import D6.iIQ.BmWxZhjGfw;
import U1.AbstractC1640b;
import U1.r;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p054g.j;
import p108m.c;
import p117n.H;
import p117n.X;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f28841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f28842f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f28843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f28844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f28845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f28846d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public AbstractC1640b f28850A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public CharSequence f28851B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public CharSequence f28852C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public ColorStateList f28853D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public PorterDuff.Mode f28854E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f28856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28859d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f28861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f28862g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f28863h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f28864i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f28865j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f28866k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f28867l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f28868m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f28869n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f28870o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f28871p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f28872q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f28873r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f28874s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f28875t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f28876u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f28877v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f28878w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f28879x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f28880y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f28881z;

        public b(Menu menu) {
            this.f28856a = menu;
            h();
        }

        public void a() {
            this.f28863h = true;
            i(this.f28856a.add(this.f28857b, this.f28864i, this.f28865j, this.f28866k));
        }

        public SubMenu b() {
            this.f28863h = true;
            SubMenu subMenuAddSubMenu = this.f28856a.addSubMenu(this.f28857b, this.f28864i, this.f28865j, this.f28866k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f28863h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f28845c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e8) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e8);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f28845c.obtainStyledAttributes(attributeSet, j.f22716o1);
            this.f28857b = typedArrayObtainStyledAttributes.getResourceId(j.f22726q1, 0);
            this.f28858c = typedArrayObtainStyledAttributes.getInt(j.f22736s1, 0);
            this.f28859d = typedArrayObtainStyledAttributes.getInt(j.f22741t1, 0);
            this.f28860e = typedArrayObtainStyledAttributes.getInt(j.f22746u1, 0);
            this.f28861f = typedArrayObtainStyledAttributes.getBoolean(j.f22731r1, true);
            this.f28862g = typedArrayObtainStyledAttributes.getBoolean(j.f22721p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            X xT = X.t(g.this.f28845c, attributeSet, j.f22751v1);
            this.f28864i = xT.m(j.f22766y1, 0);
            this.f28865j = (xT.j(j.f22544B1, this.f28858c) & (-65536)) | (xT.j(j.f22549C1, this.f28859d) & 65535);
            this.f28866k = xT.o(j.f22554D1);
            this.f28867l = xT.o(j.f22558E1);
            this.f28868m = xT.m(j.f22756w1, 0);
            this.f28869n = c(xT.n(j.f22562F1));
            this.f28870o = xT.j(j.f22590M1, 4096);
            this.f28871p = c(xT.n(j.f22566G1));
            this.f28872q = xT.j(j.f22606Q1, 4096);
            if (xT.r(j.f22570H1)) {
                this.f28873r = xT.a(j.f22570H1, false) ? 1 : 0;
            } else {
                this.f28873r = this.f28860e;
            }
            this.f28874s = xT.a(j.f22771z1, false);
            this.f28875t = xT.a(j.f22539A1, this.f28861f);
            this.f28876u = xT.a(j.f22761x1, this.f28862g);
            this.f28877v = xT.j(j.f22610R1, -1);
            this.f28881z = xT.n(j.f22574I1);
            this.f28878w = xT.m(j.f22578J1, 0);
            this.f28879x = xT.n(j.f22586L1);
            String strN = xT.n(j.f22582K1);
            this.f28880y = strN;
            boolean z8 = strN != null;
            if (z8 && this.f28878w == 0 && this.f28879x == null) {
                this.f28850A = (AbstractC1640b) e(strN, g.f28842f, g.this.f28844b);
            } else {
                if (z8) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f28850A = null;
            }
            this.f28851B = xT.o(j.f22594N1);
            this.f28852C = xT.o(j.f22614S1);
            if (xT.r(j.f22602P1)) {
                this.f28854E = H.c(xT.j(j.f22602P1, -1), this.f28854E);
            } else {
                this.f28854E = null;
            }
            if (xT.r(j.f22598O1)) {
                this.f28853D = xT.c(j.f22598O1);
            } else {
                this.f28853D = null;
            }
            xT.w();
            this.f28863h = false;
        }

        public void h() {
            this.f28857b = 0;
            this.f28858c = 0;
            this.f28859d = 0;
            this.f28860e = 0;
            this.f28861f = true;
            this.f28862g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z8 = false;
            menuItem.setChecked(this.f28874s).setVisible(this.f28875t).setEnabled(this.f28876u).setCheckable(this.f28873r >= 1).setTitleCondensed(this.f28867l).setIcon(this.f28868m);
            int i8 = this.f28877v;
            if (i8 >= 0) {
                menuItem.setShowAsAction(i8);
            }
            if (this.f28881z != null) {
                if (g.this.f28845c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f28881z));
            }
            if (this.f28873r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof c) {
                    ((c) menuItem).h(true);
                }
            }
            String str = this.f28879x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f28841e, g.this.f28843a));
                z8 = true;
            }
            int i9 = this.f28878w;
            if (i9 > 0) {
                if (z8) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i9);
                }
            }
            AbstractC1640b abstractC1640b = this.f28850A;
            if (abstractC1640b != null) {
                r.a(menuItem, abstractC1640b);
            }
            r.c(menuItem, this.f28851B);
            r.g(menuItem, this.f28852C);
            r.b(menuItem, this.f28869n, this.f28870o);
            r.f(menuItem, this.f28871p, this.f28872q);
            PorterDuff.Mode mode = this.f28854E;
            if (mode != null) {
                r.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f28853D;
            if (colorStateList != null) {
                r.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f28841e = clsArr;
        f28842f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f28845c = context;
        Object[] objArr = {context};
        this.f28843a = objArr;
        this.f28844b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f28846d == null) {
            this.f28846d = a(this.f28845c);
        }
        return this.f28846d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z8 = false;
        boolean z9 = false;
        String str = null;
        while (!z8) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z9 && name2.equals(str)) {
                        z9 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC1640b abstractC1640b = bVar.f28850A;
                            if (abstractC1640b == null || !abstractC1640b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z8 = true;
                    }
                }
            } else if (!z9) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z9 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i8, Menu menu) {
        if (!(menu instanceof N1.a)) {
            super.inflate(i8, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z8 = false;
        try {
            try {
                layout = this.f28845c.getResources().getLayout(i8);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof e) {
                    e eVar = (e) menu;
                    if (eVar.F()) {
                        eVar.e0();
                        z8 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z8) {
                    ((e) menu).d0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } catch (Throwable th) {
            if (z8) {
                ((e) menu).d0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class[] f28847c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f28848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f28849b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f28849b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f28849b.invoke(this.f28848a, menuItem)).booleanValue();
                }
                this.f28849b.invoke(this.f28848a, menuItem);
                return true;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }

        public a(Object obj, String str) {
            this.f28848a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f28849b = cls.getMethod(str, f28847c);
            } catch (Exception e8) {
                InflateException inflateException = new InflateException(BmWxZhjGfw.NGNLJfGnhLGdmGe + str + " in class " + cls.getName());
                inflateException.initCause(e8);
                throw inflateException;
            }
        }
    }
}
