package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.utils.Event;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticsEntry implements Event {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String NAME_KEY = "name";

    @Deprecated
    public static final String PROPERTIES_KEY = "properties";

    @Deprecated
    public static final String TIMESTAMP_KEY = "timestamp";

    @Deprecated
    public static final int VERSION = 1;

    @Deprecated
    public static final String VERSION_KEY = "version";
    private final DateProvider dateProvider;
    private final Date dateTime;
    private final DiagnosticsEntryName name;
    private final Map<String, Object> properties;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    public DiagnosticsEntry(DiagnosticsEntryName name, Map<String, ? extends Object> properties, DateProvider dateProvider, Date dateTime) {
        t.g(name, "name");
        t.g(properties, "properties");
        t.g(dateProvider, "dateProvider");
        t.g(dateTime, "dateTime");
        this.name = name;
        this.properties = properties;
        this.dateProvider = dateProvider;
        this.dateTime = dateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiagnosticsEntry copy$default(DiagnosticsEntry diagnosticsEntry, DiagnosticsEntryName diagnosticsEntryName, Map map, DateProvider dateProvider, Date date, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            diagnosticsEntryName = diagnosticsEntry.name;
        }
        if ((i8 & 2) != 0) {
            map = diagnosticsEntry.properties;
        }
        if ((i8 & 4) != 0) {
            dateProvider = diagnosticsEntry.dateProvider;
        }
        if ((i8 & 8) != 0) {
            date = diagnosticsEntry.dateTime;
        }
        return diagnosticsEntry.copy(diagnosticsEntryName, map, dateProvider, date);
    }

    private final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VERSION_KEY, 1);
        String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
        t.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject.put("name", lowerCase);
        jSONObject.put(PROPERTIES_KEY, new JSONObject(this.properties));
        jSONObject.put(TIMESTAMP_KEY, Iso8601Utils.format(this.dateTime));
        return jSONObject;
    }

    public final DiagnosticsEntryName component1() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.properties;
    }

    public final DateProvider component3() {
        return this.dateProvider;
    }

    public final Date component4() {
        return this.dateTime;
    }

    public final DiagnosticsEntry copy(DiagnosticsEntryName name, Map<String, ? extends Object> properties, DateProvider dateProvider, Date dateTime) {
        t.g(name, "name");
        t.g(properties, "properties");
        t.g(dateProvider, "dateProvider");
        t.g(dateTime, "dateTime");
        return new DiagnosticsEntry(name, properties, dateProvider, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiagnosticsEntry)) {
            return false;
        }
        DiagnosticsEntry diagnosticsEntry = (DiagnosticsEntry) obj;
        return this.name == diagnosticsEntry.name && t.c(this.properties, diagnosticsEntry.properties) && t.c(this.dateProvider, diagnosticsEntry.dateProvider) && t.c(this.dateTime, diagnosticsEntry.dateTime);
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final Date getDateTime() {
        return this.dateTime;
    }

    public final DiagnosticsEntryName getName() {
        return this.name;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.properties.hashCode()) * 31) + this.dateProvider.hashCode()) * 31) + this.dateTime.hashCode();
    }

    @Override // com.revenuecat.purchases.utils.Event
    public String toString() {
        String string = toJSONObject().toString();
        t.f(string, "toJSONObject().toString()");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DiagnosticsEntry(DiagnosticsEntryName diagnosticsEntryName, Map map, DateProvider dateProvider, Date date, int i8, AbstractC2633k abstractC2633k) {
        dateProvider = (i8 & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        this(diagnosticsEntryName, map, dateProvider, (i8 & 8) != 0 ? dateProvider.getNow() : date);
    }
}
