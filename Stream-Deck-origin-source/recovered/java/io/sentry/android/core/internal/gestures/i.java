package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f26383a = new int[2];

    public static io.sentry.internal.gestures.b a(SentryAndroidOptions sentryAndroidOptions, View view, float f8, float f9, io.sentry.internal.gestures.b.a aVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (d(view2, f8, f9)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                        linkedList.add(viewGroup.getChildAt(i8));
                    }
                }
                Iterator<io.sentry.internal.gestures.a> it = sentryAndroidOptions.getGestureTargetLocators().iterator();
                while (it.hasNext()) {
                    io.sentry.internal.gestures.b bVarA = it.next().a(view2, f8, f9, aVar);
                    if (bVarA != null) {
                        if (aVar == io.sentry.internal.gestures.b.a.CLICKABLE) {
                            bVar = bVarA;
                        } else if (aVar == io.sentry.internal.gestures.b.a.SCROLLABLE) {
                            return bVarA;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public static String b(View view) {
        int id = view.getId();
        if (id == -1 || c(id)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }

    public static boolean c(int i8) {
        return ((-16777216) & i8) == 0 && (i8 & 16777215) != 0;
    }

    public static boolean d(View view, float f8, float f9) {
        if (view == null) {
            return false;
        }
        int[] iArr = f26383a;
        view.getLocationOnScreen(iArr);
        int i8 = iArr[0];
        int i9 = iArr[1];
        return f8 >= ((float) i8) && f8 <= ((float) (i8 + view.getWidth())) && f9 >= ((float) i9) && f9 <= ((float) (i9 + view.getHeight()));
    }
}
