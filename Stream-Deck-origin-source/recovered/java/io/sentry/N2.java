package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f25960a;

    public N2(J2 j8) {
        this.f25960a = j8;
    }

    public Boolean b(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = this.f25960a.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = this.f25960a.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public List a(StackTraceElement[] stackTraceElementArr, boolean z8) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z8 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith(QhsKALGiniuQ.kwuBdjoCFXBSXz)) {
                    io.sentry.protocol.y yVar = new io.sentry.protocol.y();
                    yVar.u(b(className));
                    yVar.x(className);
                    yVar.t(stackTraceElement.getMethodName());
                    yVar.s(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        yVar.v(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    yVar.y(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(yVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
