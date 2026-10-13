package com.elgato.streamdeck.vsd2;

import com.google.protobuf.A;
import com.google.protobuf.AbstractC2086a;
import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.AbstractC2098i;
import com.google.protobuf.C2106q;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.Timestamp;
import com.google.protobuf.U;
import com.google.protobuf.g0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class KnownHost extends GeneratedMessageLite implements KnownHostOrBuilder {
    public static final int CREATEDAT_FIELD_NUMBER = 4;
    private static final KnownHost DEFAULT_INSTANCE;
    public static final int DELETEDAT_FIELD_NUMBER = 6;
    public static final int DEVICES_FIELD_NUMBER = 8;
    public static final int DISPLAYNAME_FIELD_NUMBER = 2;
    public static final int ISAUTHENTICATED_FIELD_NUMBER = 7;
    public static final int LASTENDPOINT_FIELD_NUMBER = 3;
    private static volatile g0 PARSER = null;
    public static final int RAWID_FIELD_NUMBER = 1;
    public static final int UPDATEDAT_FIELD_NUMBER = 5;
    private int bitField0_;
    private Timestamp createdAt_;
    private Timestamp deletedAt_;
    private boolean isAuthenticated_;
    private Endpoint lastEndpoint_;
    private Timestamp updatedAt_;
    private String rawID_ = "";
    private String displayName_ = "";
    private A.j devices_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.KnownHost$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.f.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Builder extends GeneratedMessageLite.b implements KnownHostOrBuilder {
        public Builder addAllDevices(Iterable<? extends Device> iterable) {
            copyOnWrite();
            ((KnownHost) this.instance).addAllDevices(iterable);
            return this;
        }

        public Builder addDevices(Device device) {
            copyOnWrite();
            ((KnownHost) this.instance).addDevices(device);
            return this;
        }

        public Builder clearCreatedAt() {
            copyOnWrite();
            ((KnownHost) this.instance).clearCreatedAt();
            return this;
        }

        public Builder clearDeletedAt() {
            copyOnWrite();
            ((KnownHost) this.instance).clearDeletedAt();
            return this;
        }

        public Builder clearDevices() {
            copyOnWrite();
            ((KnownHost) this.instance).clearDevices();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((KnownHost) this.instance).clearDisplayName();
            return this;
        }

        public Builder clearIsAuthenticated() {
            copyOnWrite();
            ((KnownHost) this.instance).clearIsAuthenticated();
            return this;
        }

        public Builder clearLastEndpoint() {
            copyOnWrite();
            ((KnownHost) this.instance).clearLastEndpoint();
            return this;
        }

        public Builder clearRawID() {
            copyOnWrite();
            ((KnownHost) this.instance).clearRawID();
            return this;
        }

        public Builder clearUpdatedAt() {
            copyOnWrite();
            ((KnownHost) this.instance).clearUpdatedAt();
            return this;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public Timestamp getCreatedAt() {
            return ((KnownHost) this.instance).getCreatedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public Timestamp getDeletedAt() {
            return ((KnownHost) this.instance).getDeletedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public Device getDevices(int i8) {
            return ((KnownHost) this.instance).getDevices(i8);
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public int getDevicesCount() {
            return ((KnownHost) this.instance).getDevicesCount();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public List<Device> getDevicesList() {
            return Collections.unmodifiableList(((KnownHost) this.instance).getDevicesList());
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public String getDisplayName() {
            return ((KnownHost) this.instance).getDisplayName();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public AbstractC2097h getDisplayNameBytes() {
            return ((KnownHost) this.instance).getDisplayNameBytes();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public boolean getIsAuthenticated() {
            return ((KnownHost) this.instance).getIsAuthenticated();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public Endpoint getLastEndpoint() {
            return ((KnownHost) this.instance).getLastEndpoint();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public String getRawID() {
            return ((KnownHost) this.instance).getRawID();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public AbstractC2097h getRawIDBytes() {
            return ((KnownHost) this.instance).getRawIDBytes();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public Timestamp getUpdatedAt() {
            return ((KnownHost) this.instance).getUpdatedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public boolean hasCreatedAt() {
            return ((KnownHost) this.instance).hasCreatedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public boolean hasDeletedAt() {
            return ((KnownHost) this.instance).hasDeletedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public boolean hasLastEndpoint() {
            return ((KnownHost) this.instance).hasLastEndpoint();
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
        public boolean hasUpdatedAt() {
            return ((KnownHost) this.instance).hasUpdatedAt();
        }

        public Builder mergeCreatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((KnownHost) this.instance).mergeCreatedAt(timestamp);
            return this;
        }

        public Builder mergeDeletedAt(Timestamp timestamp) {
            copyOnWrite();
            ((KnownHost) this.instance).mergeDeletedAt(timestamp);
            return this;
        }

        public Builder mergeLastEndpoint(Endpoint endpoint) {
            copyOnWrite();
            ((KnownHost) this.instance).mergeLastEndpoint(endpoint);
            return this;
        }

        public Builder mergeUpdatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((KnownHost) this.instance).mergeUpdatedAt(timestamp);
            return this;
        }

        public Builder removeDevices(int i8) {
            copyOnWrite();
            ((KnownHost) this.instance).removeDevices(i8);
            return this;
        }

        public Builder setCreatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((KnownHost) this.instance).setCreatedAt(timestamp);
            return this;
        }

        public Builder setDeletedAt(Timestamp timestamp) {
            copyOnWrite();
            ((KnownHost) this.instance).setDeletedAt(timestamp);
            return this;
        }

        public Builder setDevices(int i8, Device device) {
            copyOnWrite();
            ((KnownHost) this.instance).setDevices(i8, device);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((KnownHost) this.instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((KnownHost) this.instance).setDisplayNameBytes(abstractC2097h);
            return this;
        }

        public Builder setIsAuthenticated(boolean z8) {
            copyOnWrite();
            ((KnownHost) this.instance).setIsAuthenticated(z8);
            return this;
        }

        public Builder setLastEndpoint(Endpoint endpoint) {
            copyOnWrite();
            ((KnownHost) this.instance).setLastEndpoint(endpoint);
            return this;
        }

        public Builder setRawID(String str) {
            copyOnWrite();
            ((KnownHost) this.instance).setRawID(str);
            return this;
        }

        public Builder setRawIDBytes(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((KnownHost) this.instance).setRawIDBytes(abstractC2097h);
            return this;
        }

        public Builder setUpdatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((KnownHost) this.instance).setUpdatedAt(timestamp);
            return this;
        }

        private Builder() {
            super(KnownHost.DEFAULT_INSTANCE);
        }

        public Builder addDevices(int i8, Device device) {
            copyOnWrite();
            ((KnownHost) this.instance).addDevices(i8, device);
            return this;
        }

        public Builder setCreatedAt(Timestamp.b bVar) {
            copyOnWrite();
            ((KnownHost) this.instance).setCreatedAt((Timestamp) bVar.build());
            return this;
        }

        public Builder setDeletedAt(Timestamp.b bVar) {
            copyOnWrite();
            ((KnownHost) this.instance).setDeletedAt((Timestamp) bVar.build());
            return this;
        }

        public Builder setDevices(int i8, Device.Builder builder) {
            copyOnWrite();
            ((KnownHost) this.instance).setDevices(i8, (Device) builder.build());
            return this;
        }

        public Builder setLastEndpoint(Endpoint.Builder builder) {
            copyOnWrite();
            ((KnownHost) this.instance).setLastEndpoint((Endpoint) builder.build());
            return this;
        }

        public Builder setUpdatedAt(Timestamp.b bVar) {
            copyOnWrite();
            ((KnownHost) this.instance).setUpdatedAt((Timestamp) bVar.build());
            return this;
        }

        public Builder addDevices(Device.Builder builder) {
            copyOnWrite();
            ((KnownHost) this.instance).addDevices((Device) builder.build());
            return this;
        }

        public Builder addDevices(int i8, Device.Builder builder) {
            copyOnWrite();
            ((KnownHost) this.instance).addDevices(i8, (Device) builder.build());
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Device extends GeneratedMessageLite implements DeviceOrBuilder {
        public static final int APPEARANCE_FIELD_NUMBER = 15;
        public static final int CREATEDAT_FIELD_NUMBER = 3;
        public static final int CUSTOMFACEPLATE_FIELD_NUMBER = 17;
        public static final int DEFAULTFACEPLATE_FIELD_NUMBER = 16;
        private static final Device DEFAULT_INSTANCE;
        public static final int DISPLAYNAME_FIELD_NUMBER = 6;
        public static final int ICONHEIGHT_FIELD_NUMBER = 8;
        public static final int ICONWIDTH_FIELD_NUMBER = 7;
        public static final int ISCUSTOMLAYOUT_FIELD_NUMBER = 13;
        public static final int KEYPADCOLUMNS_FIELD_NUMBER = 10;
        public static final int KEYPADROTATION_FIELD_NUMBER = 14;
        public static final int KEYPADROWS_FIELD_NUMBER = 9;
        public static final int LASTCUSTOMKEYPADCOLUMNS_FIELD_NUMBER = 12;
        public static final int LASTCUSTOMKEYPADROWS_FIELD_NUMBER = 11;
        public static final int LASTOPENEDAT_FIELD_NUMBER = 5;
        private static volatile g0 PARSER = null;
        public static final int RAWID_FIELD_NUMBER = 1;
        public static final int RAWWORKSTATIONID_FIELD_NUMBER = 2;
        public static final int UPDATEDAT_FIELD_NUMBER = 4;
        private int appearance_;
        private int bitField0_;
        private Timestamp createdAt_;
        private Object faceplate_;
        private int iconHeight_;
        private int iconWidth_;
        private boolean isCustomLayout_;
        private int keypadColumns_;
        private int keypadRotation_;
        private int keypadRows_;
        private int lastCustomKeypadColumns_;
        private int lastCustomKeypadRows_;
        private Timestamp lastOpenedAt_;
        private Timestamp updatedAt_;
        private int faceplateCase_ = 0;
        private String rawID_ = "";
        private String rawWorkstationID_ = "";
        private String displayName_ = "";

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum Appearance implements A.c {
            SYSTEM(0),
            LIGHT(1),
            DARK(2),
            UNRECOGNIZED(-1);

            public static final int DARK_VALUE = 2;
            public static final int LIGHT_VALUE = 1;
            public static final int SYSTEM_VALUE = 0;
            private static final A.d internalValueMap = new A.d() { // from class: com.elgato.streamdeck.vsd2.KnownHost.Device.Appearance.1
                @Override // com.google.protobuf.A.d
                public Appearance findValueByNumber(int i8) {
                    return Appearance.forNumber(i8);
                }
            };
            private final int value;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class AppearanceVerifier implements A.e {
                static final A.e INSTANCE = new AppearanceVerifier();

                private AppearanceVerifier() {
                }

                @Override // com.google.protobuf.A.e
                public boolean isInRange(int i8) {
                    return Appearance.forNumber(i8) != null;
                }
            }

            Appearance(int i8) {
                this.value = i8;
            }

            public static Appearance forNumber(int i8) {
                if (i8 == 0) {
                    return SYSTEM;
                }
                if (i8 == 1) {
                    return LIGHT;
                }
                if (i8 != 2) {
                    return null;
                }
                return DARK;
            }

            public static A.d internalGetValueMap() {
                return internalValueMap;
            }

            public static A.e internalGetVerifier() {
                return AppearanceVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.A.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static Appearance valueOf(int i8) {
                return forNumber(i8);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class Builder extends GeneratedMessageLite.b implements DeviceOrBuilder {
            public Builder clearAppearance() {
                copyOnWrite();
                ((Device) this.instance).clearAppearance();
                return this;
            }

            public Builder clearCreatedAt() {
                copyOnWrite();
                ((Device) this.instance).clearCreatedAt();
                return this;
            }

            public Builder clearCustomFaceplate() {
                copyOnWrite();
                ((Device) this.instance).clearCustomFaceplate();
                return this;
            }

            public Builder clearDefaultFaceplate() {
                copyOnWrite();
                ((Device) this.instance).clearDefaultFaceplate();
                return this;
            }

            public Builder clearDisplayName() {
                copyOnWrite();
                ((Device) this.instance).clearDisplayName();
                return this;
            }

            public Builder clearFaceplate() {
                copyOnWrite();
                ((Device) this.instance).clearFaceplate();
                return this;
            }

            public Builder clearIconHeight() {
                copyOnWrite();
                ((Device) this.instance).clearIconHeight();
                return this;
            }

            public Builder clearIconWidth() {
                copyOnWrite();
                ((Device) this.instance).clearIconWidth();
                return this;
            }

            public Builder clearIsCustomLayout() {
                copyOnWrite();
                ((Device) this.instance).clearIsCustomLayout();
                return this;
            }

            public Builder clearKeypadColumns() {
                copyOnWrite();
                ((Device) this.instance).clearKeypadColumns();
                return this;
            }

            public Builder clearKeypadRotation() {
                copyOnWrite();
                ((Device) this.instance).clearKeypadRotation();
                return this;
            }

            public Builder clearKeypadRows() {
                copyOnWrite();
                ((Device) this.instance).clearKeypadRows();
                return this;
            }

            public Builder clearLastCustomKeypadColumns() {
                copyOnWrite();
                ((Device) this.instance).clearLastCustomKeypadColumns();
                return this;
            }

            public Builder clearLastCustomKeypadRows() {
                copyOnWrite();
                ((Device) this.instance).clearLastCustomKeypadRows();
                return this;
            }

            public Builder clearLastOpenedAt() {
                copyOnWrite();
                ((Device) this.instance).clearLastOpenedAt();
                return this;
            }

            public Builder clearRawID() {
                copyOnWrite();
                ((Device) this.instance).clearRawID();
                return this;
            }

            public Builder clearRawWorkstationID() {
                copyOnWrite();
                ((Device) this.instance).clearRawWorkstationID();
                return this;
            }

            public Builder clearUpdatedAt() {
                copyOnWrite();
                ((Device) this.instance).clearUpdatedAt();
                return this;
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public Appearance getAppearance() {
                return ((Device) this.instance).getAppearance();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public int getAppearanceValue() {
                return ((Device) this.instance).getAppearanceValue();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public Timestamp getCreatedAt() {
                return ((Device) this.instance).getCreatedAt();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public String getCustomFaceplate() {
                return ((Device) this.instance).getCustomFaceplate();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public AbstractC2097h getCustomFaceplateBytes() {
                return ((Device) this.instance).getCustomFaceplateBytes();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public String getDefaultFaceplate() {
                return ((Device) this.instance).getDefaultFaceplate();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public AbstractC2097h getDefaultFaceplateBytes() {
                return ((Device) this.instance).getDefaultFaceplateBytes();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public String getDisplayName() {
                return ((Device) this.instance).getDisplayName();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public AbstractC2097h getDisplayNameBytes() {
                return ((Device) this.instance).getDisplayNameBytes();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public FaceplateCase getFaceplateCase() {
                return ((Device) this.instance).getFaceplateCase();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public int getIconHeight() {
                return ((Device) this.instance).getIconHeight();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public int getIconWidth() {
                return ((Device) this.instance).getIconWidth();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public boolean getIsCustomLayout() {
                return ((Device) this.instance).getIsCustomLayout();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public int getKeypadColumns() {
                return ((Device) this.instance).getKeypadColumns();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public KeypadOrientationOption getKeypadRotation() {
                return ((Device) this.instance).getKeypadRotation();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public int getKeypadRotationValue() {
                return ((Device) this.instance).getKeypadRotationValue();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public int getKeypadRows() {
                return ((Device) this.instance).getKeypadRows();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public int getLastCustomKeypadColumns() {
                return ((Device) this.instance).getLastCustomKeypadColumns();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public int getLastCustomKeypadRows() {
                return ((Device) this.instance).getLastCustomKeypadRows();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public Timestamp getLastOpenedAt() {
                return ((Device) this.instance).getLastOpenedAt();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public String getRawID() {
                return ((Device) this.instance).getRawID();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public AbstractC2097h getRawIDBytes() {
                return ((Device) this.instance).getRawIDBytes();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public String getRawWorkstationID() {
                return ((Device) this.instance).getRawWorkstationID();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public AbstractC2097h getRawWorkstationIDBytes() {
                return ((Device) this.instance).getRawWorkstationIDBytes();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public Timestamp getUpdatedAt() {
                return ((Device) this.instance).getUpdatedAt();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public boolean hasCreatedAt() {
                return ((Device) this.instance).hasCreatedAt();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public boolean hasCustomFaceplate() {
                return ((Device) this.instance).hasCustomFaceplate();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public boolean hasDefaultFaceplate() {
                return ((Device) this.instance).hasDefaultFaceplate();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public boolean hasLastOpenedAt() {
                return ((Device) this.instance).hasLastOpenedAt();
            }

            @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
            public boolean hasUpdatedAt() {
                return ((Device) this.instance).hasUpdatedAt();
            }

            public Builder mergeCreatedAt(Timestamp timestamp) {
                copyOnWrite();
                ((Device) this.instance).mergeCreatedAt(timestamp);
                return this;
            }

            public Builder mergeLastOpenedAt(Timestamp timestamp) {
                copyOnWrite();
                ((Device) this.instance).mergeLastOpenedAt(timestamp);
                return this;
            }

            public Builder mergeUpdatedAt(Timestamp timestamp) {
                copyOnWrite();
                ((Device) this.instance).mergeUpdatedAt(timestamp);
                return this;
            }

            public Builder setAppearance(Appearance appearance) {
                copyOnWrite();
                ((Device) this.instance).setAppearance(appearance);
                return this;
            }

            public Builder setAppearanceValue(int i8) {
                copyOnWrite();
                ((Device) this.instance).setAppearanceValue(i8);
                return this;
            }

            public Builder setCreatedAt(Timestamp timestamp) {
                copyOnWrite();
                ((Device) this.instance).setCreatedAt(timestamp);
                return this;
            }

            public Builder setCustomFaceplate(String str) {
                copyOnWrite();
                ((Device) this.instance).setCustomFaceplate(str);
                return this;
            }

            public Builder setCustomFaceplateBytes(AbstractC2097h abstractC2097h) {
                copyOnWrite();
                ((Device) this.instance).setCustomFaceplateBytes(abstractC2097h);
                return this;
            }

            public Builder setDefaultFaceplate(String str) {
                copyOnWrite();
                ((Device) this.instance).setDefaultFaceplate(str);
                return this;
            }

            public Builder setDefaultFaceplateBytes(AbstractC2097h abstractC2097h) {
                copyOnWrite();
                ((Device) this.instance).setDefaultFaceplateBytes(abstractC2097h);
                return this;
            }

            public Builder setDisplayName(String str) {
                copyOnWrite();
                ((Device) this.instance).setDisplayName(str);
                return this;
            }

            public Builder setDisplayNameBytes(AbstractC2097h abstractC2097h) {
                copyOnWrite();
                ((Device) this.instance).setDisplayNameBytes(abstractC2097h);
                return this;
            }

            public Builder setIconHeight(int i8) {
                copyOnWrite();
                ((Device) this.instance).setIconHeight(i8);
                return this;
            }

            public Builder setIconWidth(int i8) {
                copyOnWrite();
                ((Device) this.instance).setIconWidth(i8);
                return this;
            }

            public Builder setIsCustomLayout(boolean z8) {
                copyOnWrite();
                ((Device) this.instance).setIsCustomLayout(z8);
                return this;
            }

            public Builder setKeypadColumns(int i8) {
                copyOnWrite();
                ((Device) this.instance).setKeypadColumns(i8);
                return this;
            }

            public Builder setKeypadRotation(KeypadOrientationOption keypadOrientationOption) {
                copyOnWrite();
                ((Device) this.instance).setKeypadRotation(keypadOrientationOption);
                return this;
            }

            public Builder setKeypadRotationValue(int i8) {
                copyOnWrite();
                ((Device) this.instance).setKeypadRotationValue(i8);
                return this;
            }

            public Builder setKeypadRows(int i8) {
                copyOnWrite();
                ((Device) this.instance).setKeypadRows(i8);
                return this;
            }

            public Builder setLastCustomKeypadColumns(int i8) {
                copyOnWrite();
                ((Device) this.instance).setLastCustomKeypadColumns(i8);
                return this;
            }

            public Builder setLastCustomKeypadRows(int i8) {
                copyOnWrite();
                ((Device) this.instance).setLastCustomKeypadRows(i8);
                return this;
            }

            public Builder setLastOpenedAt(Timestamp timestamp) {
                copyOnWrite();
                ((Device) this.instance).setLastOpenedAt(timestamp);
                return this;
            }

            public Builder setRawID(String str) {
                copyOnWrite();
                ((Device) this.instance).setRawID(str);
                return this;
            }

            public Builder setRawIDBytes(AbstractC2097h abstractC2097h) {
                copyOnWrite();
                ((Device) this.instance).setRawIDBytes(abstractC2097h);
                return this;
            }

            public Builder setRawWorkstationID(String str) {
                copyOnWrite();
                ((Device) this.instance).setRawWorkstationID(str);
                return this;
            }

            public Builder setRawWorkstationIDBytes(AbstractC2097h abstractC2097h) {
                copyOnWrite();
                ((Device) this.instance).setRawWorkstationIDBytes(abstractC2097h);
                return this;
            }

            public Builder setUpdatedAt(Timestamp timestamp) {
                copyOnWrite();
                ((Device) this.instance).setUpdatedAt(timestamp);
                return this;
            }

            private Builder() {
                super(Device.DEFAULT_INSTANCE);
            }

            public Builder setCreatedAt(Timestamp.b bVar) {
                copyOnWrite();
                ((Device) this.instance).setCreatedAt((Timestamp) bVar.build());
                return this;
            }

            public Builder setLastOpenedAt(Timestamp.b bVar) {
                copyOnWrite();
                ((Device) this.instance).setLastOpenedAt((Timestamp) bVar.build());
                return this;
            }

            public Builder setUpdatedAt(Timestamp.b bVar) {
                copyOnWrite();
                ((Device) this.instance).setUpdatedAt((Timestamp) bVar.build());
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum FaceplateCase {
            DEFAULTFACEPLATE(16),
            CUSTOMFACEPLATE(17),
            FACEPLATE_NOT_SET(0);

            private final int value;

            FaceplateCase(int i8) {
                this.value = i8;
            }

            public static FaceplateCase forNumber(int i8) {
                if (i8 == 0) {
                    return FACEPLATE_NOT_SET;
                }
                if (i8 == 16) {
                    return DEFAULTFACEPLATE;
                }
                if (i8 != 17) {
                    return null;
                }
                return CUSTOMFACEPLATE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static FaceplateCase valueOf(int i8) {
                return forNumber(i8);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum KeypadOrientationOption implements A.c {
            FIXED(0),
            DYNAMIC(1),
            UNRECOGNIZED(-1);

            public static final int DYNAMIC_VALUE = 1;
            public static final int FIXED_VALUE = 0;
            private static final A.d internalValueMap = new A.d() { // from class: com.elgato.streamdeck.vsd2.KnownHost.Device.KeypadOrientationOption.1
                @Override // com.google.protobuf.A.d
                public KeypadOrientationOption findValueByNumber(int i8) {
                    return KeypadOrientationOption.forNumber(i8);
                }
            };
            private final int value;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class KeypadOrientationOptionVerifier implements A.e {
                static final A.e INSTANCE = new KeypadOrientationOptionVerifier();

                private KeypadOrientationOptionVerifier() {
                }

                @Override // com.google.protobuf.A.e
                public boolean isInRange(int i8) {
                    return KeypadOrientationOption.forNumber(i8) != null;
                }
            }

            KeypadOrientationOption(int i8) {
                this.value = i8;
            }

            public static KeypadOrientationOption forNumber(int i8) {
                if (i8 == 0) {
                    return FIXED;
                }
                if (i8 != 1) {
                    return null;
                }
                return DYNAMIC;
            }

            public static A.d internalGetValueMap() {
                return internalValueMap;
            }

            public static A.e internalGetVerifier() {
                return KeypadOrientationOptionVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.A.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static KeypadOrientationOption valueOf(int i8) {
                return forNumber(i8);
            }
        }

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            GeneratedMessageLite.registerDefaultInstance(Device.class, device);
        }

        private Device() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppearance() {
            this.appearance_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreatedAt() {
            this.createdAt_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomFaceplate() {
            if (this.faceplateCase_ == 17) {
                this.faceplateCase_ = 0;
                this.faceplate_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultFaceplate() {
            if (this.faceplateCase_ == 16) {
                this.faceplateCase_ = 0;
                this.faceplate_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplayName() {
            this.displayName_ = getDefaultInstance().getDisplayName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFaceplate() {
            this.faceplateCase_ = 0;
            this.faceplate_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconHeight() {
            this.iconHeight_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconWidth() {
            this.iconWidth_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsCustomLayout() {
            this.isCustomLayout_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeypadColumns() {
            this.keypadColumns_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeypadRotation() {
            this.keypadRotation_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeypadRows() {
            this.keypadRows_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastCustomKeypadColumns() {
            this.lastCustomKeypadColumns_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastCustomKeypadRows() {
            this.lastCustomKeypadRows_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastOpenedAt() {
            this.lastOpenedAt_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRawID() {
            this.rawID_ = getDefaultInstance().getRawID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRawWorkstationID() {
            this.rawWorkstationID_ = getDefaultInstance().getRawWorkstationID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdatedAt() {
            this.updatedAt_ = null;
            this.bitField0_ &= -3;
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCreatedAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.createdAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.createdAt_ = timestamp;
            } else {
                this.createdAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.createdAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLastOpenedAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.lastOpenedAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.lastOpenedAt_ = timestamp;
            } else {
                this.lastOpenedAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.lastOpenedAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUpdatedAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.updatedAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.updatedAt_ = timestamp;
            } else {
                this.updatedAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.updatedAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Device parseDelimitedFrom(InputStream inputStream) {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppearance(Appearance appearance) {
            this.appearance_ = appearance.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppearanceValue(int i8) {
            this.appearance_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreatedAt(Timestamp timestamp) {
            timestamp.getClass();
            this.createdAt_ = timestamp;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomFaceplate(String str) {
            str.getClass();
            this.faceplateCase_ = 17;
            this.faceplate_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomFaceplateBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.faceplate_ = abstractC2097h.T();
            this.faceplateCase_ = 17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultFaceplate(String str) {
            str.getClass();
            this.faceplateCase_ = 16;
            this.faceplate_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultFaceplateBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.faceplate_ = abstractC2097h.T();
            this.faceplateCase_ = 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayName(String str) {
            str.getClass();
            this.displayName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayNameBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.displayName_ = abstractC2097h.T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconHeight(int i8) {
            this.iconHeight_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconWidth(int i8) {
            this.iconWidth_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsCustomLayout(boolean z8) {
            this.isCustomLayout_ = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeypadColumns(int i8) {
            this.keypadColumns_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeypadRotation(KeypadOrientationOption keypadOrientationOption) {
            this.keypadRotation_ = keypadOrientationOption.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeypadRotationValue(int i8) {
            this.keypadRotation_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeypadRows(int i8) {
            this.keypadRows_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastCustomKeypadColumns(int i8) {
            this.lastCustomKeypadColumns_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastCustomKeypadRows(int i8) {
            this.lastCustomKeypadRows_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastOpenedAt(Timestamp timestamp) {
            timestamp.getClass();
            this.lastOpenedAt_ = timestamp;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRawID(String str) {
            str.getClass();
            this.rawID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRawIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.rawID_ = abstractC2097h.T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRawWorkstationID(String str) {
            str.getClass();
            this.rawWorkstationID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRawWorkstationIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.rawWorkstationID_ = abstractC2097h.T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatedAt(Timestamp timestamp) {
            timestamp.getClass();
            this.updatedAt_ = timestamp;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fVar.ordinal()]) {
                case 1:
                    return new Device();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0001\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006Ȉ\u0007\u000b\b\u000b\t\u000b\n\u000b\u000b\u000b\f\u000b\r\u0007\u000e\f\u000f\f\u0010Ȼ\u0000\u0011Ȼ\u0000", new Object[]{"faceplate_", "faceplateCase_", "bitField0_", "rawID_", "rawWorkstationID_", "createdAt_", "updatedAt_", "lastOpenedAt_", "displayName_", "iconWidth_", "iconHeight_", "keypadRows_", "keypadColumns_", "lastCustomKeypadRows_", "lastCustomKeypadColumns_", "isCustomLayout_", "keypadRotation_", "appearance_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Device.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public Appearance getAppearance() {
            Appearance appearanceForNumber = Appearance.forNumber(this.appearance_);
            return appearanceForNumber == null ? Appearance.UNRECOGNIZED : appearanceForNumber;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public int getAppearanceValue() {
            return this.appearance_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public Timestamp getCreatedAt() {
            Timestamp timestamp = this.createdAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public String getCustomFaceplate() {
            return this.faceplateCase_ == 17 ? (String) this.faceplate_ : "";
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public AbstractC2097h getCustomFaceplateBytes() {
            return AbstractC2097h.E(this.faceplateCase_ == 17 ? (String) this.faceplate_ : "");
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public String getDefaultFaceplate() {
            return this.faceplateCase_ == 16 ? (String) this.faceplate_ : "";
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public AbstractC2097h getDefaultFaceplateBytes() {
            return AbstractC2097h.E(this.faceplateCase_ == 16 ? (String) this.faceplate_ : "");
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public String getDisplayName() {
            return this.displayName_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public AbstractC2097h getDisplayNameBytes() {
            return AbstractC2097h.E(this.displayName_);
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public FaceplateCase getFaceplateCase() {
            return FaceplateCase.forNumber(this.faceplateCase_);
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public int getIconHeight() {
            return this.iconHeight_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public int getIconWidth() {
            return this.iconWidth_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public boolean getIsCustomLayout() {
            return this.isCustomLayout_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public int getKeypadColumns() {
            return this.keypadColumns_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public KeypadOrientationOption getKeypadRotation() {
            KeypadOrientationOption keypadOrientationOptionForNumber = KeypadOrientationOption.forNumber(this.keypadRotation_);
            return keypadOrientationOptionForNumber == null ? KeypadOrientationOption.UNRECOGNIZED : keypadOrientationOptionForNumber;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public int getKeypadRotationValue() {
            return this.keypadRotation_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public int getKeypadRows() {
            return this.keypadRows_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public int getLastCustomKeypadColumns() {
            return this.lastCustomKeypadColumns_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public int getLastCustomKeypadRows() {
            return this.lastCustomKeypadRows_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public Timestamp getLastOpenedAt() {
            Timestamp timestamp = this.lastOpenedAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public String getRawID() {
            return this.rawID_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public AbstractC2097h getRawIDBytes() {
            return AbstractC2097h.E(this.rawID_);
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public String getRawWorkstationID() {
            return this.rawWorkstationID_;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public AbstractC2097h getRawWorkstationIDBytes() {
            return AbstractC2097h.E(this.rawWorkstationID_);
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public Timestamp getUpdatedAt() {
            Timestamp timestamp = this.updatedAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public boolean hasCreatedAt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public boolean hasCustomFaceplate() {
            return this.faceplateCase_ == 17;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public boolean hasDefaultFaceplate() {
            return this.faceplateCase_ == 16;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public boolean hasLastOpenedAt() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.elgato.streamdeck.vsd2.KnownHost.DeviceOrBuilder
        public boolean hasUpdatedAt() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(Device device) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(device);
        }

        public static Device parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Device parseFrom(AbstractC2097h abstractC2097h) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static Device parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Device parseFrom(byte[] bArr) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Device parseFrom(byte[] bArr, C2106q c2106q) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Device parseFrom(InputStream inputStream) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Device parseFrom(AbstractC2098i abstractC2098i) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Device parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface DeviceOrBuilder extends U {
        Device.Appearance getAppearance();

        int getAppearanceValue();

        Timestamp getCreatedAt();

        String getCustomFaceplate();

        AbstractC2097h getCustomFaceplateBytes();

        String getDefaultFaceplate();

        AbstractC2097h getDefaultFaceplateBytes();

        @Override // com.google.protobuf.U
        /* synthetic */ T getDefaultInstanceForType();

        String getDisplayName();

        AbstractC2097h getDisplayNameBytes();

        Device.FaceplateCase getFaceplateCase();

        int getIconHeight();

        int getIconWidth();

        boolean getIsCustomLayout();

        int getKeypadColumns();

        Device.KeypadOrientationOption getKeypadRotation();

        int getKeypadRotationValue();

        int getKeypadRows();

        int getLastCustomKeypadColumns();

        int getLastCustomKeypadRows();

        Timestamp getLastOpenedAt();

        String getRawID();

        AbstractC2097h getRawIDBytes();

        String getRawWorkstationID();

        AbstractC2097h getRawWorkstationIDBytes();

        Timestamp getUpdatedAt();

        boolean hasCreatedAt();

        boolean hasCustomFaceplate();

        boolean hasDefaultFaceplate();

        boolean hasLastOpenedAt();

        boolean hasUpdatedAt();

        @Override // com.google.protobuf.U
        /* synthetic */ boolean isInitialized();
    }

    static {
        KnownHost knownHost = new KnownHost();
        DEFAULT_INSTANCE = knownHost;
        GeneratedMessageLite.registerDefaultInstance(KnownHost.class, knownHost);
    }

    private KnownHost() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDevices(Iterable<? extends Device> iterable) {
        ensureDevicesIsMutable();
        AbstractC2086a.addAll((Iterable) iterable, (List) this.devices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDevices(Device device) {
        device.getClass();
        ensureDevicesIsMutable();
        this.devices_.add(device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletedAt() {
        this.deletedAt_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevices() {
        this.devices_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuthenticated() {
        this.isAuthenticated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastEndpoint() {
        this.lastEndpoint_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawID() {
        this.rawID_ = getDefaultInstance().getRawID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedAt() {
        this.updatedAt_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureDevicesIsMutable() {
        A.j jVar = this.devices_;
        if (jVar.C()) {
            return;
        }
        this.devices_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static KnownHost getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.createdAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.createdAt_ = timestamp;
        } else {
            this.createdAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.createdAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeletedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.deletedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.deletedAt_ = timestamp;
        } else {
            this.deletedAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.deletedAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastEndpoint(Endpoint endpoint) {
        endpoint.getClass();
        Endpoint endpoint2 = this.lastEndpoint_;
        if (endpoint2 == null || endpoint2 == Endpoint.getDefaultInstance()) {
            this.lastEndpoint_ = endpoint;
        } else {
            this.lastEndpoint_ = (Endpoint) ((Endpoint.Builder) Endpoint.newBuilder(this.lastEndpoint_).mergeFrom((GeneratedMessageLite) endpoint)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.updatedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.updatedAt_ = timestamp;
        } else {
            this.updatedAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.updatedAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static KnownHost parseDelimitedFrom(InputStream inputStream) {
        return (KnownHost) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KnownHost parseFrom(ByteBuffer byteBuffer) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDevices(int i8) {
        ensureDevicesIsMutable();
        this.devices_.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.createdAt_ = timestamp;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.deletedAt_ = timestamp;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevices(int i8, Device device) {
        device.getClass();
        ensureDevicesIsMutable();
        this.devices_.set(i8, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(AbstractC2097h abstractC2097h) {
        AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
        this.displayName_ = abstractC2097h.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuthenticated(boolean z8) {
        this.isAuthenticated_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastEndpoint(Endpoint endpoint) {
        endpoint.getClass();
        this.lastEndpoint_ = endpoint;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawID(String str) {
        str.getClass();
        this.rawID_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawIDBytes(AbstractC2097h abstractC2097h) {
        AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
        this.rawID_ = abstractC2097h.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.updatedAt_ = timestamp;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        g0 cVar;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fVar.ordinal()]) {
            case 1:
                return new KnownHost();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007\u0007\b\u001b", new Object[]{"bitField0_", "rawID_", "displayName_", "lastEndpoint_", "createdAt_", "updatedAt_", "deletedAt_", "isAuthenticated_", "devices_", Device.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                g0 g0Var = PARSER;
                if (g0Var != null) {
                    return g0Var;
                }
                synchronized (KnownHost.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public Timestamp getDeletedAt() {
        Timestamp timestamp = this.deletedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public Device getDevices(int i8) {
        return (Device) this.devices_.get(i8);
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public int getDevicesCount() {
        return this.devices_.size();
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public List<Device> getDevicesList() {
        return this.devices_;
    }

    public DeviceOrBuilder getDevicesOrBuilder(int i8) {
        return (DeviceOrBuilder) this.devices_.get(i8);
    }

    public List<? extends DeviceOrBuilder> getDevicesOrBuilderList() {
        return this.devices_;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public AbstractC2097h getDisplayNameBytes() {
        return AbstractC2097h.E(this.displayName_);
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public boolean getIsAuthenticated() {
        return this.isAuthenticated_;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public Endpoint getLastEndpoint() {
        Endpoint endpoint = this.lastEndpoint_;
        return endpoint == null ? Endpoint.getDefaultInstance() : endpoint;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public String getRawID() {
        return this.rawID_;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public AbstractC2097h getRawIDBytes() {
        return AbstractC2097h.E(this.rawID_);
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.updatedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public boolean hasCreatedAt() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public boolean hasDeletedAt() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public boolean hasLastEndpoint() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.KnownHostOrBuilder
    public boolean hasUpdatedAt() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(KnownHost knownHost) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(knownHost);
    }

    public static KnownHost parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
        return (KnownHost) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static KnownHost parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
    }

    public static KnownHost parseFrom(AbstractC2097h abstractC2097h) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDevices(int i8, Device device) {
        device.getClass();
        ensureDevicesIsMutable();
        this.devices_.add(i8, device);
    }

    public static KnownHost parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
    }

    public static KnownHost parseFrom(byte[] bArr) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KnownHost parseFrom(byte[] bArr, C2106q c2106q) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
    }

    public static KnownHost parseFrom(InputStream inputStream) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KnownHost parseFrom(InputStream inputStream, C2106q c2106q) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static KnownHost parseFrom(AbstractC2098i abstractC2098i) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
    }

    public static KnownHost parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
        return (KnownHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
    }
}
