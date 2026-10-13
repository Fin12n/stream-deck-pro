package p176u1;

import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f34353e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f34354f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3033q f34356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34357c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34358d = -1;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public E(String str) {
        this.f34355a = str;
    }

    public final char a(int i8) {
        C3033q c3033q = this.f34356b;
        if (c3033q == null) {
            return this.f34355a.charAt(i8);
        }
        if (i8 < this.f34357c) {
            return this.f34355a.charAt(i8);
        }
        int iE = c3033q.e();
        int i9 = this.f34357c;
        return i8 < iE + i9 ? c3033q.d(i8 - i9) : this.f34355a.charAt(i8 - ((iE - this.f34358d) + i9));
    }

    public final int b() {
        C3033q c3033q = this.f34356b;
        return c3033q == null ? this.f34355a.length() : (this.f34355a.length() - (this.f34358d - this.f34357c)) + c3033q.e();
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
    public String toString() {
        C3033q c3033q = this.f34356b;
        if (c3033q == null) {
            return this.f34355a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f34355a, 0, this.f34357c);
        c3033q.a(sb);
        String str = this.f34355a;
        sb.append((CharSequence) str, this.f34358d, str.length());
        return sb.toString();
    }

    public final void c(int i8, int i9, String str) {
        if (i8 > i9) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i8 + " > " + i9).toString());
        }
        if (i8 < 0) {
            throw new IllegalArgumentException((ajyWhveMDgQ.laMYryChkssr + i8).toString());
        }
        C3033q c3033q = this.f34356b;
        if (c3033q != null) {
            int i10 = this.f34357c;
            int i11 = i8 - i10;
            int i12 = i9 - i10;
            if (i11 >= 0 && i12 <= c3033q.e()) {
                c3033q.g(i11, i12, str);
                return;
            }
            this.f34355a = toString();
            this.f34356b = null;
            this.f34357c = -1;
            this.f34358d = -1;
            c(i8, i9, str);
            return;
        }
        int iMax = Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i8, 64);
        int iMin2 = Math.min(this.f34355a.length() - i9, 64);
        int i13 = i8 - iMin;
        AbstractC3034s.a(this.f34355a, cArr, 0, i13, i8);
        int i14 = iMax - iMin2;
        int i15 = iMin2 + i9;
        AbstractC3034s.a(this.f34355a, cArr, i14, i9, i15);
        r.b(str, cArr, iMin);
        this.f34356b = new C3033q(cArr, iMin + str.length(), i14);
        this.f34357c = i13;
        this.f34358d = i15;
    }
}
