package A7;

import Z6.v;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p211y4.vJ.RaiWHuj;
import u7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f883d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f886c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final k a(String statusLine) throws ProtocolException {
            y yVar;
            int i8;
            String strSubstring;
            t.g(statusLine, "statusLine");
            if (v.H(statusLine, "HTTP/1.", false, 2, null)) {
                i8 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    yVar = y.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    yVar = y.HTTP_1_1;
                }
            } else {
                if (!v.H(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                yVar = y.HTTP_1_0;
                i8 = 4;
            }
            int i9 = i8 + 3;
            if (statusLine.length() < i9) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i8, i9);
                t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i10 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i9) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i9) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i8 + 4);
                    t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new k(yVar, i10, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        public a() {
        }
    }

    public k(y protocol, int i8, String message) {
        t.g(protocol, "protocol");
        t.g(message, "message");
        this.f884a = protocol;
        this.f885b = i8;
        this.f886c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f884a == y.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append(RaiWHuj.EIpaw);
        }
        sb.append(' ');
        sb.append(this.f885b);
        sb.append(' ');
        sb.append(this.f886c);
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
