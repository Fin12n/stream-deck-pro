package Z6;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final h f(Matcher matcher, int i8, CharSequence charSequence) {
        if (matcher.find(i8)) {
            return new i(matcher, charSequence);
        }
        return null;
    }

    public static final h g(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new i(matcher, charSequence);
        }
        return null;
    }

    public static final W6.i h(MatchResult matchResult) {
        return W6.n.v(matchResult.start(), matchResult.end());
    }

    public static final W6.i i(MatchResult matchResult, int i8) {
        return W6.n.v(matchResult.start(i8), matchResult.end(i8));
    }

    public static final int j(Iterable iterable) {
        Iterator it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((e) it.next()).getValue();
        }
        return value;
    }
}
