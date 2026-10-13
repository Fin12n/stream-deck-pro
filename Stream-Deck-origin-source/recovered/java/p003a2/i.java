package p003a2;

import U1.C1642d;
import U1.InterfaceC1663z;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC1663z {
    public static CharSequence b(Context context, ClipData.Item item, int i8) {
        if ((i8 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    public static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // U1.InterfaceC1663z
    public C1642d a(View view, C1642d c1642d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c1642d);
        }
        if (c1642d.f() == 2) {
            return c1642d;
        }
        ClipData clipDataB = c1642d.b();
        int iD = c1642d.d();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z8 = false;
        for (int i8 = 0; i8 < clipDataB.getItemCount(); i8++) {
            CharSequence charSequenceB = b(context, clipDataB.getItemAt(i8), iD);
            if (charSequenceB != null) {
                if (z8) {
                    editable.insert(Selection.getSelectionEnd(editable), yOZfxp.DHrVADelm);
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z8 = true;
                }
            }
        }
        return null;
    }
}
