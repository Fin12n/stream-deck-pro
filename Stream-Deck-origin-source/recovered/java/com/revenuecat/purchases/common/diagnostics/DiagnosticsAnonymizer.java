package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.Anonymizer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticsAnonymizer {
    private final Anonymizer anonymizer;

    public DiagnosticsAnonymizer(Anonymizer anonymizer) {
        t.g(anonymizer, "anonymizer");
        this.anonymizer = anonymizer;
    }

    public final DiagnosticsEntry anonymizeEntryIfNeeded(DiagnosticsEntry diagnosticsEntry) {
        t.g(diagnosticsEntry, "diagnosticsEntry");
        return DiagnosticsEntry.copy$default(diagnosticsEntry, null, this.anonymizer.anonymizedMap(diagnosticsEntry.getProperties()), null, null, 13, null);
    }
}
