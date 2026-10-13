package com.revenuecat.purchases.common;

import D6.C0937q;
import D6.r;
import com.revenuecat.purchases.strings.Emojis;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum LogIntent {
    DEBUG(C0937q.e(Emojis.INFO)),
    GOOGLE_ERROR(r.q(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    GOOGLE_WARNING(r.q(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    INFO(C0937q.e(Emojis.INFO)),
    PURCHASE(C0937q.e(Emojis.MONEY_BAG)),
    RC_ERROR(r.q(Emojis.SAD_CAT_EYES, Emojis.DOUBLE_EXCLAMATION)),
    RC_PURCHASE_SUCCESS(r.q(Emojis.HEART_CAT_EYES, Emojis.MONEY_BAG)),
    RC_SUCCESS(C0937q.e(Emojis.HEART_CAT_EYES)),
    USER(C0937q.e(Emojis.PERSON)),
    WARNING(C0937q.e(Emojis.WARNING)),
    AMAZON_WARNING(r.q(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION)),
    AMAZON_ERROR(r.q(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION));

    private final List<String> emojiList;

    LogIntent(List list) {
        this.emojiList = list;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }
}
