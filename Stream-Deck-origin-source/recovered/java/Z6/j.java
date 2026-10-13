package Z6;

import java.io.Serializable;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12967b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f12968a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int b(int i8) {
            return (i8 & 2) != 0 ? i8 | 64 : i8;
        }

        public final String c(String literal) {
            kotlin.jvm.internal.t.g(literal, "literal");
            String strQuote = Pattern.quote(literal);
            kotlin.jvm.internal.t.f(strQuote, "quote(...)");
            return strQuote;
        }

        public a() {
        }
    }

    public j(Pattern nativePattern) {
        kotlin.jvm.internal.t.g(nativePattern, "nativePattern");
        this.f12968a = nativePattern;
    }

    public static /* synthetic */ h b(j jVar, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return jVar.a(charSequence, i8);
    }

    public final h a(CharSequence input, int i8) {
        kotlin.jvm.internal.t.g(input, "input");
        Matcher matcher = this.f12968a.matcher(input);
        kotlin.jvm.internal.t.f(matcher, "matcher(...)");
        return k.f(matcher, i8, input);
    }

    public final h c(CharSequence input) {
        kotlin.jvm.internal.t.g(input, "input");
        Matcher matcher = this.f12968a.matcher(input);
        kotlin.jvm.internal.t.f(matcher, "matcher(...)");
        return k.g(matcher, input);
    }

    public final boolean d(CharSequence input) {
        kotlin.jvm.internal.t.g(input, "input");
        return this.f12968a.matcher(input).matches();
    }

    public final String e(CharSequence input, Q6.k transform) {
        kotlin.jvm.internal.t.g(input, "input");
        kotlin.jvm.internal.t.g(transform, "transform");
        int iIntValue = 0;
        h hVarB = b(this, input, 0, 2, null);
        if (hVarB == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, iIntValue, hVarB.c().c().intValue());
            sb.append((CharSequence) transform.invoke(hVarB));
            iIntValue = hVarB.c().o().intValue() + 1;
            hVarB = hVarB.next();
            if (iIntValue >= length) {
                break;
            }
        } while (hVarB != null);
        if (iIntValue < length) {
            sb.append(input, iIntValue, length);
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }

    public final String f(CharSequence input, String replacement) {
        kotlin.jvm.internal.t.g(input, "input");
        kotlin.jvm.internal.t.g(replacement, "replacement");
        String strReplaceAll = this.f12968a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.t.f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f12968a.toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(String pattern) {
        kotlin.jvm.internal.t.g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.t.f(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(String pattern, l option) {
        kotlin.jvm.internal.t.g(pattern, "pattern");
        kotlin.jvm.internal.t.g(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, f12967b.b(option.getValue()));
        kotlin.jvm.internal.t.f(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(String pattern, Set<? extends l> options) {
        kotlin.jvm.internal.t.g(pattern, "pattern");
        kotlin.jvm.internal.t.g(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, f12967b.b(k.j(options)));
        kotlin.jvm.internal.t.f(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
