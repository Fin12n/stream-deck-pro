package p094k3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p121n3.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f28683a;

    public a(HttpURLConnection httpURLConnection) {
        this.f28683a = httpURLConnection;
    }

    @Override // p094k3.d
    public String G0() {
        return this.f28683a.getContentType();
    }

    @Override // p094k3.d
    public String N0() {
        try {
            if (v1()) {
                return null;
            }
            return "Unable to fetch " + this.f28683a.getURL() + ". Failed with " + this.f28683a.getResponseCode() + "\n" + b(this.f28683a);
        } catch (IOException e8) {
            d.d("get error failed ", e8);
            return e8.getMessage();
        }
    }

    @Override // p094k3.d
    public InputStream X0() {
        return this.f28683a.getInputStream();
    }

    public final String b(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28683a.disconnect();
    }

    @Override // p094k3.d
    public boolean v1() {
        try {
            return this.f28683a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
