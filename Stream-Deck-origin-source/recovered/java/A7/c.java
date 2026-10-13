package A7;

import C6.G;
import V.ocy.SVzBK;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f862a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f864c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(v7.d.f35184f);
            return simpleDateFormat;
        }
    }

    public static final Date a(String str) {
        t.g(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f862a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f863b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    DateFormat[] dateFormatArr = f864c;
                    DateFormat simpleDateFormat = dateFormatArr[i8];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f863b[i8], Locale.US);
                        simpleDateFormat.setTimeZone(v7.d.f35184f);
                        dateFormatArr[i8] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                G g8 = G.f1419a;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final String b(Date date) {
        t.g(date, "<this>");
        String str = ((DateFormat) f862a.get()).format(date);
        t.f(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", SVzBK.vmHjKKGYqMRLdkH, "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f863b = strArr;
        f864c = new DateFormat[strArr.length];
    }
}
