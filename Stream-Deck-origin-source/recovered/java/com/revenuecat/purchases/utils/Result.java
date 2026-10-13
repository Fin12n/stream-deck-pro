package com.revenuecat.purchases.utils;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Result<A, B> {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Error<B> extends Result {
        private final B value;

        public Error(B b8) {
            super(null);
            this.value = b8;
        }

        public final B getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Success<A> extends Result {
        private final A value;

        public Success(A a8) {
            super(null);
            this.value = a8;
        }

        public final A getValue() {
            return this.value;
        }
    }

    public /* synthetic */ Result(AbstractC2633k abstractC2633k) {
        this();
    }

    private Result() {
    }
}
