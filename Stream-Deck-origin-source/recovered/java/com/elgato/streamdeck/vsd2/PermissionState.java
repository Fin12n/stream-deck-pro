package com.elgato.streamdeck.vsd2;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class PermissionState {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Denied extends PermissionState {
        public static final Denied INSTANCE = new Denied();

        private Denied() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Denied);
        }

        public int hashCode() {
            return 1615429386;
        }

        public String toString() {
            return "Denied";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Granted extends PermissionState {
        public static final Granted INSTANCE = new Granted();

        private Granted() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Granted);
        }

        public int hashCode() {
            return 1561551148;
        }

        public String toString() {
            return "Granted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Rationale extends PermissionState {
        public static final Rationale INSTANCE = new Rationale();

        private Rationale() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Rationale);
        }

        public int hashCode() {
            return -1022861528;
        }

        public String toString() {
            return "Rationale";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Rejected extends PermissionState {
        public static final Rejected INSTANCE = new Rejected();

        private Rejected() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Rejected);
        }

        public int hashCode() {
            return 455735341;
        }

        public String toString() {
            return "Rejected";
        }
    }

    public /* synthetic */ PermissionState(AbstractC2633k abstractC2633k) {
        this();
    }

    private PermissionState() {
    }
}
