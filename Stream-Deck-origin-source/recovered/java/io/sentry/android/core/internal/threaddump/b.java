package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26389b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26391d;

    public b(ArrayList<? extends a> arrayList) {
        this.f26388a = arrayList;
        this.f26390c = arrayList.size();
    }

    public static b c(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new b(arrayList);
            }
            i8++;
            arrayList.add(new a(i8, line));
        }
    }

    public boolean a() {
        return this.f26391d < this.f26390c;
    }

    public a b() {
        int i8 = this.f26391d;
        if (i8 < this.f26389b || i8 >= this.f26390c) {
            return null;
        }
        ArrayList arrayList = this.f26388a;
        this.f26391d = i8 + 1;
        return (a) arrayList.get(i8);
    }

    public void d() {
        this.f26391d--;
    }
}
