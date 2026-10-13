package io.sentry.vendor.gson.internal.bind.util;

import D6.iIQ.BmWxZhjGfw;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.common.Constants;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f27764a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i8, char c8) {
        return i8 < str.length() && str.charAt(i8) == c8;
    }

    public static String b(Date date, boolean z8) {
        return c(date, z8, f27764a);
    }

    public static String c(Date date, boolean z8, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z8 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        e(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        e(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        e(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        e(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        e(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        e(sb, gregorianCalendar.get(13), 2);
        if (z8) {
            sb.append(b.f16789a);
            e(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i8 = offset / 60000;
            int iAbs = Math.abs(i8 / 60);
            int iAbs2 = Math.abs(i8 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            e(sb, iAbs, 2);
            sb.append(':');
            e(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static int d(String str, int i8) {
        while (i8 < str.length()) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < '0' || cCharAt > '9') {
                return i8;
            }
            i8++;
        }
        return str.length();
    }

    public static void e(StringBuilder sb, int i8, int i9) {
        String string = Integer.toString(i8);
        for (int length = i9 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static int g(String str, int i8, int i9) {
        int i10;
        int i11;
        if (i8 < 0 || i9 > str.length() || i8 > i9) {
            throw new NumberFormatException(str);
        }
        if (i8 < i9) {
            i11 = i8 + 1;
            int iDigit = Character.digit(str.charAt(i8), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
            }
            i10 = -iDigit;
        } else {
            i10 = 0;
            i11 = i8;
        }
        while (i11 < i9) {
            int i12 = i11 + 1;
            int iDigit2 = Character.digit(str.charAt(i11), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
            }
            i10 = (i10 * 10) - iDigit2;
            i11 = i12;
        }
        return -i10;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00de A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0192, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0127, B:69:0x0134, B:72:0x013d, B:74:0x015c, B:77:0x016b, B:78:0x018d, B:80:0x0190, B:66:0x0115, B:83:0x01c3, B:84:0x01ca, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0192, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0127, B:69:0x0134, B:72:0x013d, B:74:0x015c, B:77:0x016b, B:78:0x018d, B:80:0x0190, B:66:0x0115, B:83:0x01c3, B:84:0x01ca, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0192, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0127, B:69:0x0134, B:72:0x013d, B:74:0x015c, B:77:0x016b, B:78:0x018d, B:80:0x0190, B:66:0x0115, B:83:0x01c3, B:84:0x01ca, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0190 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0192, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0127, B:69:0x0134, B:72:0x013d, B:74:0x015c, B:77:0x016b, B:78:0x018d, B:80:0x0190, B:66:0x0115, B:83:0x01c3, B:84:0x01ca, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c3 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0192, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0127, B:69:0x0134, B:72:0x013d, B:74:0x015c, B:77:0x016b, B:78:0x018d, B:80:0x0190, B:66:0x0115, B:83:0x01c3, B:84:0x01ca, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0115, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01cf, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01ef, please report this as an issue */
    public static Date f(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i8;
        int i9;
        int i10;
        int iG;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i11 = index + 4;
            int iG2 = g(str, index, i11);
            if (a(str, i11, '-')) {
                i11 = index + 5;
            }
            int i12 = i11 + 2;
            int iG3 = g(str, i11, i12);
            if (a(str, i12, '-')) {
                i12 = i11 + 3;
            }
            int i13 = i12 + 2;
            int iG4 = g(str, i12, i13);
            boolean zA = a(str, i13, 'T');
            if (!zA && str.length() <= i13) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iG2, iG3 - 1, iG4);
                parsePosition.setIndex(i13);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i14 = i12 + 5;
                int iG5 = g(str, i12 + 3, i14);
                if (a(str, i14, ':')) {
                    i14 = i12 + 6;
                }
                int i15 = i14 + 2;
                int iG6 = g(str, i14, i15);
                if (a(str, i15, ':')) {
                    i15 = i14 + 3;
                }
                if (str.length() <= i15 || (cCharAt2 = str.charAt(i15)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i13 = i15;
                    i8 = iG5;
                    i9 = iG6;
                } else {
                    int i16 = i15 + 2;
                    iG = g(str, i15, i16);
                    if (iG > 59 && iG < 63) {
                        iG = 59;
                    }
                    if (a(str, i16, b.f16789a)) {
                        int i17 = i15 + 3;
                        int iD = d(str, i15 + 4);
                        int iMin = Math.min(iD, i15 + 6);
                        int iG7 = g(str, i17, iMin);
                        int i18 = iMin - i17;
                        if (i18 == 1) {
                            iG7 *= 100;
                        } else if (i18 == 2) {
                            iG7 *= 10;
                        }
                        i8 = iG5;
                        i13 = iD;
                        i9 = iG6;
                        i10 = iG7;
                    } else {
                        i8 = iG5;
                        i13 = i16;
                        i9 = iG6;
                        i10 = 0;
                    }
                }
                if (str.length() > i13) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i13);
                if (cCharAt == 'Z') {
                    timeZone = f27764a;
                    length = i13 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i13);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + BmWxZhjGfw.vWhDjxKB;
                    }
                    length = i13 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = f27764a;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id = timeZone2.getID();
                        if (!id.equals(str3) && !id.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iG2);
                gregorianCalendar2.set(2, iG3 - 1);
                gregorianCalendar2.set(5, iG4);
                gregorianCalendar2.set(11, i8);
                gregorianCalendar2.set(12, i9);
                gregorianCalendar2.set(13, iG);
                gregorianCalendar2.set(14, i10);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i8 = 0;
            i9 = 0;
            i10 = 0;
            iG = 0;
            if (str.length() > i13) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i13);
            if (cCharAt == 'Z') {
                timeZone = f27764a;
                length = i13 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i13);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + BmWxZhjGfw.vWhDjxKB;
                }
                length = i13 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = f27764a;
                } else {
                    timeZone = f27764a;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iG2);
            gregorianCalendar3.set(2, iG3 - 1);
            gregorianCalendar3.set(5, iG4);
            gregorianCalendar3.set(11, i8);
            gregorianCalendar3.set(12, i9);
            gregorianCalendar3.set(13, iG);
            gregorianCalendar3.set(14, i10);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e8) {
            e = e8;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e9) {
            e = e9;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e10) {
            e = e10;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }
}
