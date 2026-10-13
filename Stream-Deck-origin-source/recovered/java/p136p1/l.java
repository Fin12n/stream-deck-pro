package p136p1;

import C6.o;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import p152r1.e;
import p152r1.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i8 = 0;
        lineInstance.setText(new e(charSequence, 0, charSequence.length()));
        PriorityQueue<o> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: p1.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l.d((o) obj, (o) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i9 = i8;
            i8 = next;
            if (i8 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new o(Integer.valueOf(i9), Integer.valueOf(i8)));
            } else {
                o oVar = (o) priorityQueue.peek();
                if (oVar != null && ((Number) oVar.d()).intValue() - ((Number) oVar.c()).intValue() < i8 - i9) {
                    priorityQueue.poll();
                    priorityQueue.add(new o(Integer.valueOf(i9), Integer.valueOf(i8)));
                }
            }
            next = lineInstance.next();
        }
        float fMax = 0.0f;
        for (o oVar2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) oVar2.a()).intValue(), ((Number) oVar2.b()).intValue(), textPaint));
        }
        return fMax;
    }

    public static final int d(o oVar, o oVar2) {
        return (((Number) oVar.d()).intValue() - ((Number) oVar.c()).intValue()) - (((Number) oVar2.d()).intValue() - ((Number) oVar2.c()).intValue());
    }

    public static final boolean e(float f8, CharSequence charSequence, TextPaint textPaint) {
        if (f8 == 0.0f) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (o.a(spanned, f.class) || o.a(spanned, e.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != 0.0f;
    }
}
