package J0;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: J0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1019b {
    public static final void a(Appendable appendable, Object obj, Q6.k kVar) throws IOException {
        if (kVar != null) {
            appendable.append((CharSequence) kVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    public static final Appendable b(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Q6.k kVar) throws IOException {
        appendable.append(charSequence2);
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            i9++;
            if (i9 > 1) {
                appendable.append(charSequence);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            a(appendable, obj, kVar);
        }
        if (i8 >= 0 && i9 > i8) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String c(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Q6.k kVar) {
        return ((StringBuilder) b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i8, charSequence4, kVar)).toString();
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Q6.k kVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i9 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i9 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i9 & 32) != 0) {
            kVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        Q6.k kVar2 = kVar;
        return c(list, charSequence, charSequence2, charSequence3, i8, charSequence5, kVar2);
    }

    public static final Set e(List list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            hashSet.add(list.get(i8));
        }
        return hashSet;
    }
}
