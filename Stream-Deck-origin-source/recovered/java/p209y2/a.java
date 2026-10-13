package p209y2;

import D6.C0934n;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Cursor a(Cursor c8) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(c8, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c8.getColumnNames(), c8.getCount());
            while (c8.moveToNext()) {
                Object[] objArr = new Object[c8.getColumnCount()];
                int columnCount = c8.getColumnCount();
                for (int i8 = 0; i8 < columnCount; i8++) {
                    int type = c8.getType(i8);
                    if (type == 0) {
                        objArr[i8] = null;
                    } else if (type == 1) {
                        objArr[i8] = Long.valueOf(c8.getLong(i8));
                    } else if (type == 2) {
                        objArr[i8] = Double.valueOf(c8.getDouble(i8));
                    } else if (type == 3) {
                        objArr[i8] = c8.getString(i8);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i8] = c8.getBlob(i8);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            N6.a.a(c8, null);
            return matrixCursor;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                N6.a.a(c8, th);
                throw th2;
            }
        }
    }

    public static final int b(Cursor cursor, String str) {
        return -1;
    }

    public static final int c(Cursor c8, String name) {
        t.g(c8, "c");
        t.g(name, "name");
        int columnIndex = c8.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c8.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(c8, name);
    }

    public static final int d(Cursor c8, String name) {
        String strG0;
        t.g(c8, "c");
        t.g(name, "name");
        int iC = c(c8, name);
        if (iC >= 0) {
            return iC;
        }
        try {
            String[] columnNames = c8.getColumnNames();
            t.f(columnNames, "c.columnNames");
            strG0 = C0934n.g0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e8) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e8);
            strG0 = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strG0);
    }
}
