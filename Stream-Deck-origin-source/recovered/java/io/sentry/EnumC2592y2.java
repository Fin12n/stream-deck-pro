package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.y2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2592y2 implements InterfaceC2582w0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Unknown("__unknown__");

    private final String itemType;

    /* JADX INFO: renamed from: io.sentry.y2$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC2592y2 a(W0 w8, ILogger iLogger) {
            return EnumC2592y2.valueOfLabel(w8.G().toLowerCase(Locale.ROOT));
        }
    }

    EnumC2592y2(String str) {
        this.itemType = str;
    }

    public static EnumC2592y2 resolve(Object obj) {
        if (obj instanceof C2557s2) {
            return Event;
        }
        if (obj instanceof io.sentry.protocol.B) {
            return Transaction;
        }
        if (obj instanceof Y2) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    public static EnumC2592y2 valueOfLabel(String str) {
        for (EnumC2592y2 enumC2592y2 : values()) {
            if (enumC2592y2.itemType.equals(str)) {
                return enumC2592y2;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.c(this.itemType);
    }
}
