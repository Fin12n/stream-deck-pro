package com.revenuecat.purchases.utils;

import C6.G;
import Q6.k;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.utils.Event;
import java.util.function.Function;
import java.util.stream.Stream;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class EventsFileHelper<T extends Event> {
    private final k eventDeserializer;
    private final FileHelper fileHelper;
    private final String filePath;

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        final /* synthetic */ k $streamBlock;
        final /* synthetic */ EventsFileHelper<T> this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C04521 extends u implements k {
            final /* synthetic */ EventsFileHelper<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04521(EventsFileHelper<T> eventsFileHelper) {
                super(1);
                this.this$0 = eventsFileHelper;
            }

            @Override // Q6.k
            public final T invoke(String line) {
                EventsFileHelper<T> eventsFileHelper = this.this$0;
                t.f(line, "line");
                return (T) eventsFileHelper.mapToEvent(line);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar, EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.$streamBlock = kVar;
            this.this$0 = eventsFileHelper;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Event invoke$lambda$0(k tmp0, Object obj) {
            t.g(tmp0, "$tmp0");
            return (Event) tmp0.invoke(obj);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<String>) obj);
            return G.f1419a;
        }

        public final void invoke(Stream<String> stream) {
            t.g(stream, "stream");
            k kVar = this.$streamBlock;
            final C04521 c04521 = new C04521(this.this$0);
            Object map = stream.map(new Function() { // from class: com.revenuecat.purchases.utils.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EventsFileHelper.AnonymousClass1.invoke$lambda$0(c04521, obj);
                }
            });
            t.f(map, "@Synchronized\n    fun re…        }\n        }\n    }");
            kVar.invoke(map);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21981 extends u implements k {
        final /* synthetic */ k $streamBlock;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C04531 extends u implements k {
            public static final C04531 INSTANCE = new C04531();

            public C04531() {
                super(1);
            }

            @Override // Q6.k
            public final JSONObject invoke(String str) {
                return new JSONObject(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21981(k kVar) {
            super(1);
            this.$streamBlock = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final JSONObject invoke$lambda$0(k tmp0, Object obj) {
            t.g(tmp0, "$tmp0");
            return (JSONObject) tmp0.invoke(obj);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<String>) obj);
            return G.f1419a;
        }

        public final void invoke(Stream<String> stream) {
            t.g(stream, "stream");
            k kVar = this.$streamBlock;
            final C04531 c04531 = C04531.INSTANCE;
            Object map = stream.map(new Function() { // from class: com.revenuecat.purchases.utils.b
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EventsFileHelper.C21981.invoke$lambda$0(c04531, obj);
                }
            });
            t.f(map, "stream.map { JSONObject(it) }");
            kVar.invoke(map);
        }
    }

    public EventsFileHelper(FileHelper fileHelper, String filePath, k kVar) {
        t.g(fileHelper, "fileHelper");
        t.g(filePath, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = filePath;
        this.eventDeserializer = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T mapToEvent(String str) {
        k kVar = this.eventDeserializer;
        if (kVar == null) {
            return null;
        }
        try {
            return (T) kVar.invoke(str);
        } catch (SerializationException e8) {
            LogUtilsKt.errorLog("Error parsing event from file: " + str, e8);
            return null;
        } catch (IllegalArgumentException e9) {
            LogUtilsKt.errorLog("Error parsing event from file: " + str, e9);
            return null;
        }
    }

    public final synchronized void appendEvent(T event) {
        t.g(event, "event");
        FileHelper fileHelper = this.fileHelper;
        String str = this.filePath;
        StringBuilder sb = new StringBuilder();
        sb.append(event);
        sb.append('\n');
        fileHelper.appendToFile(str, sb.toString());
    }

    public final synchronized void clear(int i8) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, i8);
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogUtilsKt.verboseLog("Failed to delete events file in " + this.filePath + com.amazon.a.a.o.c.a.b.f16789a);
        }
    }

    public final synchronized void readFile(k streamBlock) {
        try {
            t.g(streamBlock, "streamBlock");
            if (this.eventDeserializer == null || this.fileHelper.fileIsEmpty(this.filePath)) {
                Stream streamEmpty = Stream.empty();
                t.f(streamEmpty, "empty()");
                streamBlock.invoke(streamEmpty);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new AnonymousClass1(streamBlock, this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void readFileAsJson(k kVar) {
        try {
            t.g(kVar, BpgIURjN.xJxVMIAD);
            if (this.fileHelper.fileIsEmpty(this.filePath)) {
                Stream streamEmpty = Stream.empty();
                t.f(streamEmpty, "empty()");
                kVar.invoke(streamEmpty);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new C21981(kVar));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ EventsFileHelper(FileHelper fileHelper, String str, k kVar, int i8, AbstractC2633k abstractC2633k) {
        this(fileHelper, str, (i8 & 4) != 0 ? null : kVar);
    }
}
