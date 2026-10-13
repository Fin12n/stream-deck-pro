package io.sentry.internal.modules;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f27195c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ILogger f27196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f27197b = null;

    public d(ILogger iLogger) {
        this.f27196a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    public Map a() {
        Map map = this.f27197b;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.f27197b = mapB;
        return mapB;
    }

    public abstract Map b();

    public Map c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f27195c));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.f27196a.c(EnumC2596z2.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e8) {
            this.f27196a.b(EnumC2596z2.ERROR, "Error extracting modules.", e8);
            return treeMap;
        } catch (RuntimeException e9) {
            this.f27196a.a(EnumC2596z2.ERROR, e9, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
