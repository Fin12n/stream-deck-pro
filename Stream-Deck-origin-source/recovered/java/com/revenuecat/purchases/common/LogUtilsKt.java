package com.revenuecat.purchases.common;

import C6.G;
import Q6.o;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class LogUtilsKt {
    private static final String PURCHASES_LOG_TAG = "[Purchases]";

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesErrorCode.values().length];
            try {
                iArr[PurchasesErrorCode.UnknownError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesErrorCode.NetworkError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchasesErrorCode.ReceiptAlreadyInUseError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchasesErrorCode.UnexpectedBackendResponseError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidAppUserIdError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PurchasesErrorCode.OperationAlreadyInProgressError.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PurchasesErrorCode.UnknownBackendError.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PurchasesErrorCode.LogOutWithAnonymousUserError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PurchasesErrorCode.ConfigurationError.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PurchasesErrorCode.UnsupportedError.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PurchasesErrorCode.EmptySubscriberAttributesError.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PurchasesErrorCode.CustomerInfoError.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PurchasesErrorCode.SignatureVerificationError.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidSubscriberAttributesError.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseCancelledError.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PurchasesErrorCode.StoreProblemError.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseNotAllowedError.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseInvalidError.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PurchasesErrorCode.ProductNotAvailableForPurchaseError.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PurchasesErrorCode.ProductAlreadyPurchasedError.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidReceiptError.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[PurchasesErrorCode.MissingReceiptFileError.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidAppleSubscriptionKeyError.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[PurchasesErrorCode.IneligibleError.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[PurchasesErrorCode.InsufficientPermissionsError.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[PurchasesErrorCode.PaymentPendingError.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidCredentialsError.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.LogUtilsKt$debugLog$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class AnonymousClass1 extends C2639q implements o {
        public AnonymousClass1(Object obj) {
            super(2, obj, LogHandler.class, "d", "d(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (String) obj2);
            return G.f1419a;
        }

        public final void invoke(String p8, String p9) {
            t.g(p8, "p0");
            t.g(p9, "p1");
            ((LogHandler) this.receiver).d(p8, p9);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.LogUtilsKt$infoLog$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21631 extends C2639q implements o {
        public C21631(Object obj) {
            super(2, obj, LogHandler.class, "i", "i(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (String) obj2);
            return G.f1419a;
        }

        public final void invoke(String p8, String p9) {
            t.g(p8, "p0");
            t.g(p9, "p1");
            ((LogHandler) this.receiver).i(p8, p9);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.LogUtilsKt$verboseLog$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21641 extends C2639q implements o {
        public C21641(Object obj) {
            super(2, obj, LogHandler.class, "v", "v(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (String) obj2);
            return G.f1419a;
        }

        public final void invoke(String p8, String p9) {
            t.g(p8, "p0");
            t.g(p9, "p1");
            ((LogHandler) this.receiver).v(p8, p9);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.LogUtilsKt$warnLog$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C21651 extends C2639q implements o {
        public C21651(Object obj) {
            super(2, obj, LogHandler.class, "w", "w(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (String) obj2);
            return G.f1419a;
        }

        public final void invoke(String p8, String p9) {
            t.g(p8, "p0");
            t.g(p9, "p1");
            ((LogHandler) this.receiver).w(p8, p9);
        }
    }

    public static final void debugLog(String message) {
        t.g(message, "message");
        logIfEnabled(LogLevel.DEBUG, new AnonymousClass1(LogWrapperKt.getCurrentLogHandler()), message);
    }

    public static final LogLevel debugLogsEnabled(LogLevel.Companion companion, boolean z8) {
        t.g(companion, "<this>");
        return z8 ? LogLevel.DEBUG : LogLevel.INFO;
    }

    public static final void errorLog(String message, Throwable th) {
        t.g(message, "message");
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", message, th);
    }

    public static /* synthetic */ void errorLog$default(String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        errorLog(str, th);
    }

    public static final boolean getDebugLogsEnabled(LogLevel logLevel) {
        t.g(logLevel, "<this>");
        return logLevel.compareTo(LogLevel.DEBUG) <= 0;
    }

    public static final void infoLog(String message) {
        t.g(message, "message");
        logIfEnabled(LogLevel.INFO, new C21631(LogWrapperKt.getCurrentLogHandler()), message);
    }

    private static final void logIfEnabled(LogLevel logLevel, o oVar, String str) {
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            oVar.invoke("[Purchases] - " + logLevel.name(), str);
        }
    }

    public static final void verboseLog(String message) {
        t.g(message, "message");
        logIfEnabled(LogLevel.VERBOSE, new C21641(LogWrapperKt.getCurrentLogHandler()), message);
    }

    public static final void warnLog(String message) {
        t.g(message, "message");
        logIfEnabled(LogLevel.WARN, new C21651(LogWrapperKt.getCurrentLogHandler()), message);
    }

    public static final void errorLog(PurchasesError error) {
        t.g(error, "error");
        switch (WhenMappings.$EnumSwitchMapping$0[error.getCode().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                LogWrapperKt.log(LogIntent.RC_ERROR, error.toString());
                break;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
            case 16:
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
            case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
                LogWrapperKt.log(LogIntent.GOOGLE_ERROR, error.toString());
                break;
        }
    }
}
