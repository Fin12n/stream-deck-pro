package io.sentry.android.core.internal.threaddump;

import E4.JFpq.XRlnZWSrAFn;
import io.sentry.A2;
import io.sentry.EnumC2596z2;
import io.sentry.J2;
import io.sentry.N2;
import io.sentry.protocol.A;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f26392d = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f26393e = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f26394f = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f26395g = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f26396h = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f26397i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f26398j = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f26399k = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f26400l = Pattern.compile(OjEsfyJYzbPn.WeeRpCUW);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f26401m = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f26402n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f26403o = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f26404p = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f26405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N2 f26407c;

    public c(J2 j8, boolean z8) {
        this.f26405a = j8;
        this.f26406b = z8;
        this.f26407c = new N2(j8);
    }

    public final void a(A a8, A2 a9) {
        Map mapK = a8.k();
        if (mapK == null) {
            mapK = new HashMap();
        }
        A2 a10 = (A2) mapK.get(a9.f());
        if (a10 != null) {
            a10.l(Math.max(a10.g(), a9.g()));
        } else {
            mapK.put(a9.f(), new A2(a9));
        }
        a8.t(mapK);
    }

    public final Integer b(Matcher matcher, int i8, Integer num) {
        String strGroup = matcher.group(i8);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    public final Long c(Matcher matcher, int i8, Long l8) {
        String strGroup = matcher.group(i8);
        return (strGroup == null || strGroup.length() == 0) ? l8 : Long.valueOf(Long.parseLong(strGroup));
    }

    public final Integer d(Matcher matcher, int i8, Integer num) {
        String strGroup = matcher.group(i8);
        if (strGroup != null && strGroup.length() != 0) {
            int i9 = Integer.parseInt(strGroup);
            Integer numValueOf = Integer.valueOf(i9);
            if (i9 >= 0) {
                return numValueOf;
            }
        }
        return num;
    }

    public final boolean e(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    public List f(b bVar) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f26392d.matcher("");
        Matcher matcher2 = f26393e.matcher("");
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f26405a.getLogger().c(EnumC2596z2.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList;
            }
            String str = aVarB.f26387b;
            if (e(matcher, str) || e(matcher2, str)) {
                bVar.d();
                A aH = h(bVar);
                if (aH != null) {
                    arrayList.add(aH);
                }
            }
        }
        return arrayList;
    }

    public final A h(b bVar) {
        A a8 = new A();
        Matcher matcher = f26392d.matcher("");
        Matcher matcher2 = f26393e.matcher("");
        if (!bVar.a()) {
            return null;
        }
        a aVarB = bVar.b();
        boolean z8 = false;
        if (aVarB == null) {
            this.f26405a.getLogger().c(EnumC2596z2.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (e(matcher, aVarB.f26387b)) {
            Long lC = c(matcher, 4, null);
            if (lC == null) {
                this.f26405a.getLogger().c(EnumC2596z2.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            a8.u(lC);
            a8.w(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(" ")) {
                    a8.z(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    a8.z(strGroup);
                }
            }
        } else if (e(matcher2, aVarB.f26387b)) {
            Long lC2 = c(matcher2, 3, null);
            if (lC2 == null) {
                this.f26405a.getLogger().c(EnumC2596z2.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            a8.u(lC2);
            a8.w(matcher2.group(1));
        }
        String strM = a8.m();
        if (strM != null) {
            boolean zEquals = strM.equals("main");
            a8.v(Boolean.valueOf(zEquals));
            a8.q(Boolean.valueOf(zEquals));
            if (zEquals && !this.f26406b) {
                z8 = true;
            }
            a8.r(Boolean.valueOf(z8));
        }
        a8.y(g(bVar, a8));
        return a8;
    }

    public final z g(b bVar, A a8) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f26394f.matcher("");
        Matcher matcher3 = f26395g.matcher("");
        Matcher matcher4 = f26396h.matcher("");
        Matcher matcher5 = f26397i.matcher("");
        Matcher matcher6 = f26398j.matcher("");
        Matcher matcher7 = f26400l.matcher("");
        Matcher matcher8 = f26399k.matcher("");
        Matcher matcher9 = f26402n.matcher("");
        Matcher matcher10 = f26401m.matcher("");
        Matcher matcher11 = f26403o.matcher("");
        Matcher matcher12 = f26404p.matcher("");
        y yVar = null;
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f26405a.getLogger().c(EnumC2596z2.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = aVarB.f26387b;
            Matcher matcher13 = matcher12;
            if (e(matcher2, str)) {
                y yVar2 = new y();
                yVar2.z(matcher2.group(1));
                yVar2.t(matcher2.group(2));
                yVar2.v(b(matcher2, 3, null));
                arrayList.add(yVar2);
            } else {
                if (e(matcher3, str)) {
                    y yVar3 = new y();
                    yVar3.z(matcher3.group(1));
                    yVar3.t(matcher3.group(2));
                    arrayList.add(yVar3);
                } else {
                    boolean zE = e(matcher4, str);
                    String str2 = XRlnZWSrAFn.vKSJnY;
                    matcher = matcher2;
                    if (zE) {
                        yVar = new y();
                        String str3 = String.format(str2, matcher4.group(1), matcher4.group(2));
                        yVar.x(str3);
                        yVar.t(matcher4.group(3));
                        yVar.s(matcher4.group(4));
                        yVar.v(d(matcher4, 5, null));
                        yVar.u(this.f26407c.b(str3));
                        arrayList.add(yVar);
                    } else if (e(matcher5, str)) {
                        yVar = new y();
                        String str4 = String.format(str2, matcher5.group(1), matcher5.group(2));
                        yVar.x(str4);
                        yVar.t(matcher5.group(3));
                        yVar.u(this.f26407c.b(str4));
                        arrayList.add(yVar);
                    } else if (e(matcher6, str)) {
                        if (yVar != null) {
                            A2 a9 = new A2();
                            a9.l(1);
                            a9.h(matcher6.group(1));
                            a9.j(matcher6.group(2));
                            a9.i(matcher6.group(3));
                            yVar.w(a9);
                            a(a8, a9);
                        }
                    } else if (e(matcher7, str)) {
                        if (yVar != null) {
                            A2 a10 = new A2();
                            a10.l(2);
                            a10.h(matcher7.group(1));
                            a10.j(matcher7.group(2));
                            a10.i(matcher7.group(3));
                            yVar.w(a10);
                            a(a8, a10);
                        }
                    } else if (!e(matcher8, str)) {
                        if (!e(matcher9, str)) {
                            if (!e(matcher10, str)) {
                                if (!e(matcher11, str)) {
                                    if (str.length() == 0) {
                                        break;
                                    }
                                    matcher13 = matcher13;
                                    if (e(matcher13, str)) {
                                        break;
                                    }
                                } else if (yVar != null) {
                                    A2 a11 = new A2();
                                    a11.l(8);
                                    yVar.w(a11);
                                    a(a8, a11);
                                }
                            } else if (yVar != null) {
                                A2 a12 = new A2();
                                a12.l(8);
                                a12.h(matcher10.group(1));
                                a12.j(matcher10.group(2));
                                a12.i(matcher10.group(3));
                                yVar.w(a12);
                                a(a8, a12);
                            }
                        } else if (yVar != null) {
                            A2 a13 = new A2();
                            a13.l(8);
                            a13.h(matcher9.group(1));
                            a13.j(matcher9.group(2));
                            a13.i(matcher9.group(3));
                            a13.k(c(matcher9, 4, null));
                            yVar.w(a13);
                            a(a8, a13);
                        }
                        matcher13 = matcher13;
                    } else if (yVar != null) {
                        A2 a14 = new A2();
                        a14.l(4);
                        a14.h(matcher8.group(1));
                        a14.j(matcher8.group(2));
                        a14.i(matcher8.group(3));
                        yVar.w(a14);
                        a(a8, a14);
                    }
                }
                matcher12 = matcher13;
                matcher2 = matcher;
            }
            matcher = matcher2;
            yVar = null;
            matcher12 = matcher13;
            matcher2 = matcher;
        }
        Collections.reverse(arrayList);
        z zVar = new z(arrayList);
        zVar.e(Boolean.TRUE);
        return zVar;
    }
}
