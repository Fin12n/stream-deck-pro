package Z5;

import D6.r;
import Q6.k;
import Q6.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0324a f12907b = new C0324a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12908a;

    /* JADX INFO: renamed from: Z5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0324a {

        /* JADX INFO: renamed from: Z5.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0325a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0325a f12909a = new C0325a();

            public C0325a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(CharSequence it) {
                t.g(it, "it");
                return Integer.valueOf(it.length());
            }
        }

        /* JADX INFO: renamed from: Z5.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f12910a = new b();

            public b() {
                super(2);
            }

            public final Character b(CharSequence s8, int i8) {
                t.g(s8, "s");
                return Character.valueOf(s8.charAt(i8));
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((CharSequence) obj, ((Number) obj2).intValue());
            }
        }

        public /* synthetic */ C0324a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final a a(List from) {
            t.g(from, "from");
            return b(from, C0325a.f12909a, b.f12910a);
        }

        public final a b(List from, k length, o charAt) {
            Object obj;
            t.g(from, "from");
            t.g(length, "length");
            t.g(charAt, "charAt");
            Iterator it = from.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Comparable comparable = (Comparable) length.invoke(next);
                    do {
                        Object next2 = it.next();
                        Comparable comparable2 = (Comparable) length.invoke(next2);
                        if (comparable.compareTo(comparable2) < 0) {
                            next = next2;
                            comparable = comparable2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            if (obj == null) {
                throw new NoSuchElementException("Unable to build char tree from an empty list");
            }
            int iIntValue = ((Number) length.invoke(obj)).intValue();
            if (from == null || !from.isEmpty()) {
                Iterator it2 = from.iterator();
                while (it2.hasNext()) {
                    if (((Number) length.invoke(it2.next())).intValue() == 0) {
                        throw new IllegalArgumentException("There should be no empty entries");
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            c(arrayList, from, iIntValue, 0, length, charAt);
            arrayList.trimToSize();
            return new a(new b((char) 0, r.n(), arrayList));
        }

        public final void c(List list, List list2, int i8, int i9, k kVar, o oVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list2) {
                Character ch = (Character) oVar.invoke(obj, Integer.valueOf(i9));
                ch.charValue();
                Object arrayList = linkedHashMap.get(ch);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(ch, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char cCharValue = ((Character) entry.getKey()).charValue();
                List list3 = (List) entry.getValue();
                int i10 = i9 + 1;
                ArrayList arrayList2 = new ArrayList();
                C0324a c0324a = a.f12907b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list3) {
                    if (((Number) kVar.invoke(obj2)).intValue() > i10) {
                        arrayList3.add(obj2);
                    }
                }
                c0324a.c(arrayList2, arrayList3, i8, i10, kVar, oVar);
                arrayList2.trimToSize();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list3) {
                    if (((Number) kVar.invoke(obj3)).intValue() == i10) {
                        arrayList4.add(obj3);
                    }
                }
                list.add(new b(cCharValue, arrayList4, arrayList2));
            }
        }

        public C0324a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f12911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f12912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f12913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b[] f12914d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(char c8, List<Object> exact, List<b> children) {
            t.g(exact, "exact");
            t.g(children, "children");
            this.f12911a = c8;
            this.f12912b = exact;
            this.f12913c = children;
            b[] bVarArr = new b[256];
            for (int i8 = 0; i8 < 256; i8++) {
                Iterator it = this.f12913c.iterator();
                Object obj = null;
                boolean z8 = false;
                Object obj2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (!z8) {
                            break;
                        }
                        obj = obj2;
                        break;
                    } else {
                        Object next = it.next();
                        if (((b) next).f12911a == i8) {
                            if (z8) {
                                break;
                            }
                            z8 = true;
                            obj2 = next;
                        }
                    }
                }
                bVarArr[i8] = obj;
            }
            this.f12914d = bVarArr;
        }

        public final b[] a() {
            return this.f12914d;
        }

        public final List b() {
            return this.f12912b;
        }
    }

    public a(b root) {
        t.g(root, "root");
        this.f12908a = root;
    }

    public static /* synthetic */ List b(a aVar, CharSequence charSequence, int i8, int i9, boolean z8, o oVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        if ((i10 & 8) != 0) {
            z8 = false;
        }
        return aVar.a(charSequence, i8, i9, z8, oVar);
    }

    public final List a(CharSequence sequence, int i8, int i9, boolean z8, o stopPredicate) {
        t.g(sequence, "sequence");
        t.g(stopPredicate, "stopPredicate");
        if (sequence.length() == 0) {
            throw new IllegalArgumentException("Couldn't search in char tree for empty string");
        }
        b bVar = this.f12908a;
        while (i8 < i9) {
            char cCharAt = sequence.charAt(i8);
            if (((Boolean) stopPredicate.invoke(Character.valueOf(cCharAt), Integer.valueOf(cCharAt))).booleanValue()) {
                break;
            }
            b bVar2 = bVar.a()[cCharAt];
            if (bVar2 == null) {
                bVar = z8 ? bVar.a()[Character.toLowerCase(cCharAt)] : null;
                if (bVar == null) {
                    return r.n();
                }
            } else {
                bVar = bVar2;
            }
            i8++;
        }
        return bVar.b();
    }
}
