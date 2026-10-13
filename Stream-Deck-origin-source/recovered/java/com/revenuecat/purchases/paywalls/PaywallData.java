package com.revenuecat.purchases.paywalls;

import C6.InterfaceC0916e;
import C6.o;
import C6.v;
import D6.r;
import D6.z;
import Z.JTT.ryTuoS;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import com.revenuecat.purchases.utils.LocaleExtensionsKt;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.b;
import p116m7.i;
import p116m7.kKPq.toqHM;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p179u4.eubL.OjEsfyJYzbPn;
import p7.d;
import q7.AbstractC2872x0;
import q7.C2836f;
import q7.I0;
import q7.N0;
import q7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@i
public final class PaywallData {
    private final URL assetBaseURL;
    private final Configuration config;
    private final Map<String, LocalizedConfiguration> localization;
    private final int revision;
    private final String templateName;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, new Z(N0.f32043a, PaywallData$LocalizedConfiguration$$serializer.INSTANCE)};

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b serializer() {
            return PaywallData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @i
    public static final class Configuration {
        private final boolean blurredBackgroundImage;
        private final ColorInformation colors;
        private final String defaultPackage;
        private final boolean displayRestorePurchases;
        private final Images imagesWebp;
        private final Images legacyImages;
        private final List<String> packageIds;
        private final URL privacyURL;
        private final URL termsOfServiceURL;
        public static final Companion Companion = new Companion(null);
        private static final b[] $childSerializers = {new C2836f(N0.f32043a), null, null, null, null, null, null, null, null};

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        @i
        public static final class ColorInformation {
            public static final Companion Companion = new Companion(null);
            private final Colors dark;
            private final Colors light;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC0916e
            public /* synthetic */ ColorInformation(int i8, Colors colors, Colors colors2, I0 i9) {
                if (1 != (i8 & 1)) {
                    AbstractC2872x0.a(i8, 1, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE.getDescriptor());
                }
                this.light = colors;
                if ((i8 & 2) == 0) {
                    this.dark = null;
                } else {
                    this.dark = colors2;
                }
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, Colors colors, Colors colors2, int i8, Object obj) {
                if ((i8 & 1) != 0) {
                    colors = colorInformation.light;
                }
                if ((i8 & 2) != 0) {
                    colors2 = colorInformation.dark;
                }
                return colorInformation.copy(colors, colors2);
            }

            public static final /* synthetic */ void write$Self(ColorInformation colorInformation, d dVar, f fVar) {
                PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
                dVar.i(fVar, 0, paywallData$Configuration$Colors$$serializer, colorInformation.light);
                if (!dVar.G(fVar, 1) && colorInformation.dark == null) {
                    return;
                }
                dVar.t(fVar, 1, paywallData$Configuration$Colors$$serializer, colorInformation.dark);
            }

            public final Colors component1() {
                return this.light;
            }

            public final Colors component2() {
                return this.dark;
            }

            public final ColorInformation copy(Colors light, Colors colors) {
                t.g(light, "light");
                return new ColorInformation(light, colors);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return t.c(this.light, colorInformation.light) && t.c(this.dark, colorInformation.dark);
            }

            public final Colors getDark() {
                return this.dark;
            }

            public final Colors getLight() {
                return this.light;
            }

            public int hashCode() {
                int iHashCode = this.light.hashCode() * 31;
                Colors colors = this.dark;
                return iHashCode + (colors == null ? 0 : colors.hashCode());
            }

            public String toString() {
                return "ColorInformation(light=" + this.light + ", dark=" + this.dark + ')';
            }

            public ColorInformation(Colors light, Colors colors) {
                t.g(light, "light");
                this.light = light;
                this.dark = colors;
            }

            public /* synthetic */ ColorInformation(Colors colors, Colors colors2, int i8, AbstractC2633k abstractC2633k) {
                this(colors, (i8 & 2) != 0 ? null : colors2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        @i
        public static final class Colors {
            public static final Companion Companion = new Companion(null);
            private final PaywallColor accent1;
            private final PaywallColor accent2;
            private final PaywallColor accent3;
            private final PaywallColor background;
            private final PaywallColor callToActionBackground;
            private final PaywallColor callToActionForeground;
            private final PaywallColor callToActionSecondaryBackground;
            private final PaywallColor closeButton;
            private final PaywallColor text1;
            private final PaywallColor text2;
            private final PaywallColor text3;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$Colors$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC0916e
            public /* synthetic */ Colors(int i8, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor2, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor3, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor4, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor5, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor6, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor7, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor8, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor9, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor10, @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor11, I0 i9) {
                if (51 != (i8 & 51)) {
                    AbstractC2872x0.a(i8, 51, PaywallData$Configuration$Colors$$serializer.INSTANCE.getDescriptor());
                }
                this.background = paywallColor;
                this.text1 = paywallColor2;
                if ((i8 & 4) == 0) {
                    this.text2 = null;
                } else {
                    this.text2 = paywallColor3;
                }
                if ((i8 & 8) == 0) {
                    this.text3 = null;
                } else {
                    this.text3 = paywallColor4;
                }
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                if ((i8 & 64) == 0) {
                    this.callToActionSecondaryBackground = null;
                } else {
                    this.callToActionSecondaryBackground = paywallColor7;
                }
                if ((i8 & 128) == 0) {
                    this.accent1 = null;
                } else {
                    this.accent1 = paywallColor8;
                }
                if ((i8 & 256) == 0) {
                    this.accent2 = null;
                } else {
                    this.accent2 = paywallColor9;
                }
                if ((i8 & 512) == 0) {
                    this.accent3 = null;
                } else {
                    this.accent3 = paywallColor10;
                }
                if ((i8 & 1024) == 0) {
                    this.closeButton = null;
                } else {
                    this.closeButton = paywallColor11;
                }
            }

            public static /* synthetic */ Colors copy$default(Colors colors, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, int i8, Object obj) {
                if ((i8 & 1) != 0) {
                    paywallColor = colors.background;
                }
                if ((i8 & 2) != 0) {
                    paywallColor2 = colors.text1;
                }
                if ((i8 & 4) != 0) {
                    paywallColor3 = colors.text2;
                }
                if ((i8 & 8) != 0) {
                    paywallColor4 = colors.text3;
                }
                if ((i8 & 16) != 0) {
                    paywallColor5 = colors.callToActionBackground;
                }
                if ((i8 & 32) != 0) {
                    paywallColor6 = colors.callToActionForeground;
                }
                if ((i8 & 64) != 0) {
                    paywallColor7 = colors.callToActionSecondaryBackground;
                }
                if ((i8 & 128) != 0) {
                    paywallColor8 = colors.accent1;
                }
                if ((i8 & 256) != 0) {
                    paywallColor9 = colors.accent2;
                }
                if ((i8 & 512) != 0) {
                    paywallColor10 = colors.accent3;
                }
                if ((i8 & 1024) != 0) {
                    paywallColor11 = colors.closeButton;
                }
                PaywallColor paywallColor12 = paywallColor10;
                PaywallColor paywallColor13 = paywallColor11;
                PaywallColor paywallColor14 = paywallColor8;
                PaywallColor paywallColor15 = paywallColor9;
                PaywallColor paywallColor16 = paywallColor6;
                PaywallColor paywallColor17 = paywallColor7;
                PaywallColor paywallColor18 = paywallColor5;
                PaywallColor paywallColor19 = paywallColor3;
                return colors.copy(paywallColor, paywallColor2, paywallColor19, paywallColor4, paywallColor18, paywallColor16, paywallColor17, paywallColor14, paywallColor15, paywallColor12, paywallColor13);
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent1$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent2$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent3$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionBackground$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionForeground$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionSecondaryBackground$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCloseButton$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText1$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText2$annotations() {
            }

            @i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText3$annotations() {
            }

            public static final /* synthetic */ void write$Self(Colors colors, d dVar, f fVar) {
                PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
                dVar.i(fVar, 0, serializer, colors.background);
                dVar.i(fVar, 1, serializer, colors.text1);
                if (dVar.G(fVar, 2) || colors.text2 != null) {
                    dVar.t(fVar, 2, serializer, colors.text2);
                }
                if (dVar.G(fVar, 3) || colors.text3 != null) {
                    dVar.t(fVar, 3, serializer, colors.text3);
                }
                dVar.i(fVar, 4, serializer, colors.callToActionBackground);
                dVar.i(fVar, 5, serializer, colors.callToActionForeground);
                if (dVar.G(fVar, 6) || colors.callToActionSecondaryBackground != null) {
                    dVar.t(fVar, 6, serializer, colors.callToActionSecondaryBackground);
                }
                if (dVar.G(fVar, 7) || colors.accent1 != null) {
                    dVar.t(fVar, 7, serializer, colors.accent1);
                }
                if (dVar.G(fVar, 8) || colors.accent2 != null) {
                    dVar.t(fVar, 8, serializer, colors.accent2);
                }
                if (dVar.G(fVar, 9) || colors.accent3 != null) {
                    dVar.t(fVar, 9, serializer, colors.accent3);
                }
                if (!dVar.G(fVar, 10) && colors.closeButton == null) {
                    return;
                }
                dVar.t(fVar, 10, serializer, colors.closeButton);
            }

            public final PaywallColor component1() {
                return this.background;
            }

            public final PaywallColor component10() {
                return this.accent3;
            }

            public final PaywallColor component11() {
                return this.closeButton;
            }

            public final PaywallColor component2() {
                return this.text1;
            }

            public final PaywallColor component3() {
                return this.text2;
            }

            public final PaywallColor component4() {
                return this.text3;
            }

            public final PaywallColor component5() {
                return this.callToActionBackground;
            }

            public final PaywallColor component6() {
                return this.callToActionForeground;
            }

            public final PaywallColor component7() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor component8() {
                return this.accent1;
            }

            public final PaywallColor component9() {
                return this.accent2;
            }

            public final Colors copy(PaywallColor background, PaywallColor text1, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor callToActionBackground, PaywallColor callToActionForeground, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7) {
                t.g(background, "background");
                t.g(text1, "text1");
                t.g(callToActionBackground, "callToActionBackground");
                t.g(callToActionForeground, "callToActionForeground");
                return new Colors(background, text1, paywallColor, paywallColor2, callToActionBackground, callToActionForeground, paywallColor3, paywallColor4, paywallColor5, paywallColor6, paywallColor7);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Colors)) {
                    return false;
                }
                Colors colors = (Colors) obj;
                return t.c(this.background, colors.background) && t.c(this.text1, colors.text1) && t.c(this.text2, colors.text2) && t.c(this.text3, colors.text3) && t.c(this.callToActionBackground, colors.callToActionBackground) && t.c(this.callToActionForeground, colors.callToActionForeground) && t.c(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && t.c(this.accent1, colors.accent1) && t.c(this.accent2, colors.accent2) && t.c(this.accent3, colors.accent3) && t.c(this.closeButton, colors.closeButton);
            }

            public final PaywallColor getAccent1() {
                return this.accent1;
            }

            public final PaywallColor getAccent2() {
                return this.accent2;
            }

            public final PaywallColor getAccent3() {
                return this.accent3;
            }

            public final PaywallColor getBackground() {
                return this.background;
            }

            public final PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            public final PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            public final PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor getCloseButton() {
                return this.closeButton;
            }

            public final PaywallColor getText1() {
                return this.text1;
            }

            public final PaywallColor getText2() {
                return this.text2;
            }

            public final PaywallColor getText3() {
                return this.text3;
            }

            public int hashCode() {
                int iHashCode = ((this.background.hashCode() * 31) + this.text1.hashCode()) * 31;
                PaywallColor paywallColor = this.text2;
                int iHashCode2 = (iHashCode + (paywallColor == null ? 0 : paywallColor.hashCode())) * 31;
                PaywallColor paywallColor2 = this.text3;
                int iHashCode3 = (((((iHashCode2 + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31) + this.callToActionBackground.hashCode()) * 31) + this.callToActionForeground.hashCode()) * 31;
                PaywallColor paywallColor3 = this.callToActionSecondaryBackground;
                int iHashCode4 = (iHashCode3 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.accent1;
                int iHashCode5 = (iHashCode4 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.accent2;
                int iHashCode6 = (iHashCode5 + (paywallColor5 == null ? 0 : paywallColor5.hashCode())) * 31;
                PaywallColor paywallColor6 = this.accent3;
                int iHashCode7 = (iHashCode6 + (paywallColor6 == null ? 0 : paywallColor6.hashCode())) * 31;
                PaywallColor paywallColor7 = this.closeButton;
                return iHashCode7 + (paywallColor7 != null ? paywallColor7.hashCode() : 0);
            }

            public Colors(PaywallColor background, PaywallColor text1, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor callToActionBackground, PaywallColor callToActionForeground, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7) {
                t.g(background, "background");
                t.g(text1, "text1");
                t.g(callToActionBackground, "callToActionBackground");
                t.g(callToActionForeground, "callToActionForeground");
                this.background = background;
                this.text1 = text1;
                this.text2 = paywallColor;
                this.text3 = paywallColor2;
                this.callToActionBackground = callToActionBackground;
                this.callToActionForeground = callToActionForeground;
                this.callToActionSecondaryBackground = paywallColor3;
                this.accent1 = paywallColor4;
                this.accent2 = paywallColor5;
                this.accent3 = paywallColor6;
                this.closeButton = paywallColor7;
            }

            public String toString() {
                return "Colors(background=" + this.background + ", text1=" + this.text1 + ", text2=" + this.text2 + ", text3=" + this.text3 + ryTuoS.ReqVfk + this.callToActionBackground + ", callToActionForeground=" + this.callToActionForeground + WaYxBuDSBD.eClKyOoDzLI + this.callToActionSecondaryBackground + ", accent1=" + this.accent1 + ", accent2=" + this.accent2 + ", accent3=" + this.accent3 + ", closeButton=" + this.closeButton + ')';
            }

            public /* synthetic */ Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, int i8, AbstractC2633k abstractC2633k) {
                this(paywallColor, paywallColor2, (i8 & 4) != 0 ? null : paywallColor3, (i8 & 8) != 0 ? null : paywallColor4, paywallColor5, paywallColor6, (i8 & 64) != 0 ? null : paywallColor7, (i8 & 128) != 0 ? null : paywallColor8, (i8 & 256) != 0 ? null : paywallColor9, (i8 & 512) != 0 ? null : paywallColor10, (i8 & 1024) != 0 ? null : paywallColor11);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
                this();
            }

            public final b serializer() {
                return PaywallData$Configuration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        @i
        public static final class Images {
            public static final Companion Companion = new Companion(null);
            private final String background;
            private final String header;
            private final String icon;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$Images$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Images() {
                this((String) null, (String) null, (String) null, 7, (AbstractC2633k) null);
            }

            public static /* synthetic */ Images copy$default(Images images, String str, String str2, String str3, int i8, Object obj) {
                if ((i8 & 1) != 0) {
                    str = images.header;
                }
                if ((i8 & 2) != 0) {
                    str2 = images.background;
                }
                if ((i8 & 4) != 0) {
                    str3 = images.icon;
                }
                return images.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self(Images images, d dVar, f fVar) {
                if (dVar.G(fVar, 0) || images.header != null) {
                    dVar.t(fVar, 0, EmptyStringToNullSerializer.INSTANCE, images.header);
                }
                if (dVar.G(fVar, 1) || images.background != null) {
                    dVar.t(fVar, 1, EmptyStringToNullSerializer.INSTANCE, images.background);
                }
                if (!dVar.G(fVar, 2) && images.icon == null) {
                    return;
                }
                dVar.t(fVar, 2, EmptyStringToNullSerializer.INSTANCE, images.icon);
            }

            public final String component1() {
                return this.header;
            }

            public final String component2() {
                return this.background;
            }

            public final String component3() {
                return this.icon;
            }

            public final Images copy(String str, String str2, String str3) {
                return new Images(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Images)) {
                    return false;
                }
                Images images = (Images) obj;
                return t.c(this.header, images.header) && t.c(this.background, images.background) && t.c(this.icon, images.icon);
            }

            public final List<String> getAll$purchases_defaultsRelease() {
                return r.s(this.header, this.background, this.icon);
            }

            public final String getBackground() {
                return this.background;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                String str = this.header;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.background;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Images(header=" + this.header + ", background=" + this.background + ", icon=" + this.icon + ')';
            }

            @InterfaceC0916e
            public /* synthetic */ Images(int i8, @i(with = EmptyStringToNullSerializer.class) String str, @i(with = EmptyStringToNullSerializer.class) String str2, @i(with = EmptyStringToNullSerializer.class) String str3, I0 i9) {
                if ((i8 & 1) == 0) {
                    this.header = null;
                } else {
                    this.header = str;
                }
                if ((i8 & 2) == 0) {
                    this.background = null;
                } else {
                    this.background = str2;
                }
                if ((i8 & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = str3;
                }
            }

            public Images(String str, String str2, String str3) {
                this.header = str;
                this.background = str2;
                this.icon = str3;
            }

            public /* synthetic */ Images(String str, String str2, String str3, int i8, AbstractC2633k abstractC2633k) {
                this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
            }

            @i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getHeader$annotations() {
            }

            @i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getIcon$annotations() {
            }
        }

        @InterfaceC0916e
        public /* synthetic */ Configuration(int i8, List list, String str, Images images, Images images2, boolean z8, boolean z9, @i(with = OptionalURLSerializer.class) URL url, @i(with = OptionalURLSerializer.class) URL url2, ColorInformation colorInformation, I0 i9) {
            if (257 != (i8 & 257)) {
                AbstractC2872x0.a(i8, 257, PaywallData$Configuration$$serializer.INSTANCE.getDescriptor());
            }
            this.packageIds = list;
            if ((i8 & 2) == 0) {
                this.defaultPackage = null;
            } else {
                this.defaultPackage = str;
            }
            if ((i8 & 4) == 0) {
                this.imagesWebp = null;
            } else {
                this.imagesWebp = images;
            }
            if ((i8 & 8) == 0) {
                this.legacyImages = null;
            } else {
                this.legacyImages = images2;
            }
            if ((i8 & 16) == 0) {
                this.blurredBackgroundImage = false;
            } else {
                this.blurredBackgroundImage = z8;
            }
            if ((i8 & 32) == 0) {
                this.displayRestorePurchases = true;
            } else {
                this.displayRestorePurchases = z9;
            }
            if ((i8 & 64) == 0) {
                this.termsOfServiceURL = null;
            } else {
                this.termsOfServiceURL = url;
            }
            if ((i8 & 128) == 0) {
                this.privacyURL = null;
            } else {
                this.privacyURL = url2;
            }
            this.colors = colorInformation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Configuration copy$default(Configuration configuration, List list, String str, Images images, Images images2, boolean z8, boolean z9, URL url, URL url2, ColorInformation colorInformation, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                list = configuration.packageIds;
            }
            if ((i8 & 2) != 0) {
                str = configuration.defaultPackage;
            }
            if ((i8 & 4) != 0) {
                images = configuration.imagesWebp;
            }
            if ((i8 & 8) != 0) {
                images2 = configuration.legacyImages;
            }
            if ((i8 & 16) != 0) {
                z8 = configuration.blurredBackgroundImage;
            }
            if ((i8 & 32) != 0) {
                z9 = configuration.displayRestorePurchases;
            }
            if ((i8 & 64) != 0) {
                url = configuration.termsOfServiceURL;
            }
            if ((i8 & 128) != 0) {
                url2 = configuration.privacyURL;
            }
            if ((i8 & 256) != 0) {
                colorInformation = configuration.colors;
            }
            URL url3 = url2;
            ColorInformation colorInformation2 = colorInformation;
            boolean z10 = z9;
            URL url4 = url;
            boolean z11 = z8;
            Images images3 = images;
            return configuration.copy(list, str, images3, images2, z11, z10, url4, url3, colorInformation2);
        }

        public static /* synthetic */ void getBlurredBackgroundImage$annotations() {
        }

        public static /* synthetic */ void getDefaultPackage$annotations() {
        }

        public static /* synthetic */ void getDisplayRestorePurchases$annotations() {
        }

        public static /* synthetic */ void getImagesWebp$purchases_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getLegacyImages$purchases_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getPackageIds$annotations() {
        }

        @i(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getPrivacyURL$annotations() {
        }

        @i(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getTermsOfServiceURL$annotations() {
        }

        public static final /* synthetic */ void write$Self(Configuration configuration, d dVar, f fVar) {
            dVar.i(fVar, 0, $childSerializers[0], configuration.packageIds);
            if (dVar.G(fVar, 1) || configuration.defaultPackage != null) {
                dVar.t(fVar, 1, N0.f32043a, configuration.defaultPackage);
            }
            if (dVar.G(fVar, 2) || configuration.imagesWebp != null) {
                dVar.t(fVar, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.imagesWebp);
            }
            if (dVar.G(fVar, 3) || configuration.legacyImages != null) {
                dVar.t(fVar, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.legacyImages);
            }
            if (dVar.G(fVar, 4) || configuration.blurredBackgroundImage) {
                dVar.w(fVar, 4, configuration.blurredBackgroundImage);
            }
            if (dVar.G(fVar, 5) || !configuration.displayRestorePurchases) {
                dVar.w(fVar, 5, configuration.displayRestorePurchases);
            }
            if (dVar.G(fVar, 6) || configuration.termsOfServiceURL != null) {
                dVar.t(fVar, 6, OptionalURLSerializer.INSTANCE, configuration.termsOfServiceURL);
            }
            if (dVar.G(fVar, 7) || configuration.privacyURL != null) {
                dVar.t(fVar, 7, OptionalURLSerializer.INSTANCE, configuration.privacyURL);
            }
            dVar.i(fVar, 8, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, configuration.colors);
        }

        public final List<String> component1() {
            return this.packageIds;
        }

        public final String component2() {
            return this.defaultPackage;
        }

        public final Images component3$purchases_defaultsRelease() {
            return this.imagesWebp;
        }

        public final Images component4$purchases_defaultsRelease() {
            return this.legacyImages;
        }

        public final boolean component5() {
            return this.blurredBackgroundImage;
        }

        public final boolean component6() {
            return this.displayRestorePurchases;
        }

        public final URL component7() {
            return this.termsOfServiceURL;
        }

        public final URL component8() {
            return this.privacyURL;
        }

        public final ColorInformation component9() {
            return this.colors;
        }

        public final Configuration copy(List<String> packageIds, String str, Images images, Images images2, boolean z8, boolean z9, URL url, URL url2, ColorInformation colors) {
            t.g(packageIds, "packageIds");
            t.g(colors, "colors");
            return new Configuration(packageIds, str, images, images2, z8, z9, url, url2, colors);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return t.c(this.packageIds, configuration.packageIds) && t.c(this.defaultPackage, configuration.defaultPackage) && t.c(this.imagesWebp, configuration.imagesWebp) && t.c(this.legacyImages, configuration.legacyImages) && this.blurredBackgroundImage == configuration.blurredBackgroundImage && this.displayRestorePurchases == configuration.displayRestorePurchases && t.c(this.termsOfServiceURL, configuration.termsOfServiceURL) && t.c(this.privacyURL, configuration.privacyURL) && t.c(this.colors, configuration.colors);
        }

        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        public final ColorInformation getColors() {
            return this.colors;
        }

        public final String getDefaultPackage() {
            return this.defaultPackage;
        }

        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        public final Images getImages() {
            String header;
            String background;
            String icon;
            Images images = this.imagesWebp;
            String icon2 = null;
            if (images == null || (header = images.getHeader()) == null) {
                Images images2 = this.legacyImages;
                header = images2 != null ? images2.getHeader() : null;
            }
            Images images3 = this.imagesWebp;
            if (images3 == null || (background = images3.getBackground()) == null) {
                Images images4 = this.legacyImages;
                background = images4 != null ? images4.getBackground() : null;
            }
            Images images5 = this.imagesWebp;
            if (images5 == null || (icon = images5.getIcon()) == null) {
                Images images6 = this.legacyImages;
                if (images6 != null) {
                    icon2 = images6.getIcon();
                }
            } else {
                icon2 = icon;
            }
            return new Images(header, background, icon2);
        }

        public final Images getImagesWebp$purchases_defaultsRelease() {
            return this.imagesWebp;
        }

        public final Images getLegacyImages$purchases_defaultsRelease() {
            return this.legacyImages;
        }

        public final List<String> getPackageIds() {
            return this.packageIds;
        }

        public final URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        public int hashCode() {
            int iHashCode = this.packageIds.hashCode() * 31;
            String str = this.defaultPackage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Images images = this.imagesWebp;
            int iHashCode3 = (iHashCode2 + (images == null ? 0 : images.hashCode())) * 31;
            Images images2 = this.legacyImages;
            int iHashCode4 = (iHashCode3 + (images2 == null ? 0 : images2.hashCode())) * 31;
            boolean z8 = this.blurredBackgroundImage;
            ?? r8 = z8;
            if (z8) {
                r8 = 1;
            }
            int i8 = (iHashCode4 + r8) * 31;
            boolean z9 = this.displayRestorePurchases;
            int i9 = (i8 + (z9 ? 1 : z9)) * 31;
            URL url = this.termsOfServiceURL;
            int iHashCode5 = (i9 + (url == null ? 0 : url.hashCode())) * 31;
            URL url2 = this.privacyURL;
            return ((iHashCode5 + (url2 != null ? url2.hashCode() : 0)) * 31) + this.colors.hashCode();
        }

        public Configuration(List<String> packageIds, String str, Images images, Images images2, boolean z8, boolean z9, URL url, URL url2, ColorInformation colors) {
            t.g(packageIds, "packageIds");
            t.g(colors, "colors");
            this.packageIds = packageIds;
            this.defaultPackage = str;
            this.imagesWebp = images;
            this.legacyImages = images2;
            this.blurredBackgroundImage = z8;
            this.displayRestorePurchases = z9;
            this.termsOfServiceURL = url;
            this.privacyURL = url2;
            this.colors = colors;
        }

        public String toString() {
            return "Configuration(packageIds=" + this.packageIds + ", defaultPackage=" + this.defaultPackage + ", imagesWebp=" + this.imagesWebp + ", legacyImages=" + this.legacyImages + ", blurredBackgroundImage=" + this.blurredBackgroundImage + ajyWhveMDgQ.QKLMSbXEtbaiE + this.displayRestorePurchases + ", termsOfServiceURL=" + this.termsOfServiceURL + ", privacyURL=" + this.privacyURL + ", colors=" + this.colors + ')';
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Images images2, boolean z8, boolean z9, URL url, URL url2, ColorInformation colorInformation, int i8, AbstractC2633k abstractC2633k) {
            this(list, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : images, (i8 & 8) != 0 ? null : images2, (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? true : z9, (i8 & 64) != 0 ? null : url, (i8 & 128) != 0 ? null : url2, colorInformation);
        }

        public /* synthetic */ Configuration(List list, String str, Images images, ColorInformation colorInformation, boolean z8, boolean z9, URL url, URL url2, int i8, AbstractC2633k abstractC2633k) {
            this(list, (i8 & 2) != 0 ? null : str, images, colorInformation, (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? true : z9, (i8 & 64) != 0 ? null : url, (i8 & 128) != 0 ? null : url2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(List<String> packageIds, String str, Images images, ColorInformation colorInformation, boolean z8, boolean z9, URL url, URL url2) {
            this(packageIds, str, images, (Images) null, z8, z9, url, url2, colorInformation, 8, (AbstractC2633k) null);
            t.g(packageIds, "packageIds");
            t.g(images, "images");
            t.g(colorInformation, HRHLwtyqJWz.Ztohp);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @i
    public static final class LocalizedConfiguration {
        private final String callToAction;
        private final String callToActionWithIntroOffer;
        private final String callToActionWithMultipleIntroOffers;
        private final List<Feature> features;
        private final String offerDetails;
        private final String offerDetailsWithIntroOffer;
        private final String offerDetailsWithMultipleIntroOffers;
        private final String offerName;
        private final String subtitle;
        private final String title;
        public static final Companion Companion = new Companion(null);
        private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, new C2836f(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE)};

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
                this();
            }

            public final b serializer() {
                return PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        @i
        public static final class Feature {
            public static final Companion Companion = new Companion(null);
            private final String content;
            private final String iconID;
            private final String title;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC0916e
            public /* synthetic */ Feature(int i8, String str, String str2, String str3, I0 i9) {
                if (1 != (i8 & 1)) {
                    AbstractC2872x0.a(i8, 1, PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                if ((i8 & 2) == 0) {
                    this.content = null;
                } else {
                    this.content = str2;
                }
                if ((i8 & 4) == 0) {
                    this.iconID = null;
                } else {
                    this.iconID = str3;
                }
            }

            public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, String str3, int i8, Object obj) {
                if ((i8 & 1) != 0) {
                    str = feature.title;
                }
                if ((i8 & 2) != 0) {
                    str2 = feature.content;
                }
                if ((i8 & 4) != 0) {
                    str3 = feature.iconID;
                }
                return feature.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self(Feature feature, d dVar, f fVar) {
                dVar.q(fVar, 0, feature.title);
                if (dVar.G(fVar, 1) || feature.content != null) {
                    dVar.t(fVar, 1, N0.f32043a, feature.content);
                }
                if (!dVar.G(fVar, 2) && feature.iconID == null) {
                    return;
                }
                dVar.t(fVar, 2, N0.f32043a, feature.iconID);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.content;
            }

            public final String component3() {
                return this.iconID;
            }

            public final Feature copy(String title, String str, String str2) {
                t.g(title, "title");
                return new Feature(title, str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Feature)) {
                    return false;
                }
                Feature feature = (Feature) obj;
                return t.c(this.title, feature.title) && t.c(this.content, feature.content) && t.c(this.iconID, feature.iconID);
            }

            public final String getContent() {
                return this.content;
            }

            public final String getIconID() {
                return this.iconID;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.content;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconID;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Feature(title=" + this.title + ", content=" + this.content + ", iconID=" + this.iconID + ')';
            }

            public Feature(String title, String str, String str2) {
                t.g(title, "title");
                this.title = title;
                this.content = str;
                this.iconID = str2;
            }

            public /* synthetic */ Feature(String str, String str2, String str3, int i8, AbstractC2633k abstractC2633k) {
                this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
            }

            public static /* synthetic */ void getIconID$annotations() {
            }
        }

        @InterfaceC0916e
        public /* synthetic */ LocalizedConfiguration(int i8, String str, @i(with = EmptyStringToNullSerializer.class) String str2, String str3, @i(with = EmptyStringToNullSerializer.class) String str4, @i(with = EmptyStringToNullSerializer.class) String str5, @i(with = EmptyStringToNullSerializer.class) String str6, @i(with = EmptyStringToNullSerializer.class) String str7, @i(with = EmptyStringToNullSerializer.class) String str8, @i(with = EmptyStringToNullSerializer.class) String str9, List list, I0 i9) {
            if (5 != (i8 & 5)) {
                AbstractC2872x0.a(i8, 5, PaywallData$LocalizedConfiguration$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            if ((i8 & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.callToAction = str3;
            if ((i8 & 8) == 0) {
                this.callToActionWithIntroOffer = null;
            } else {
                this.callToActionWithIntroOffer = str4;
            }
            if ((i8 & 16) == 0) {
                this.callToActionWithMultipleIntroOffers = null;
            } else {
                this.callToActionWithMultipleIntroOffers = str5;
            }
            if ((i8 & 32) == 0) {
                this.offerDetails = null;
            } else {
                this.offerDetails = str6;
            }
            if ((i8 & 64) == 0) {
                this.offerDetailsWithIntroOffer = null;
            } else {
                this.offerDetailsWithIntroOffer = str7;
            }
            if ((i8 & 128) == 0) {
                this.offerDetailsWithMultipleIntroOffers = null;
            } else {
                this.offerDetailsWithMultipleIntroOffers = str8;
            }
            if ((i8 & 256) == 0) {
                this.offerName = null;
            } else {
                this.offerName = str9;
            }
            if ((i8 & 512) == 0) {
                this.features = r.n();
            } else {
                this.features = list;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocalizedConfiguration copy$default(LocalizedConfiguration localizedConfiguration, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = localizedConfiguration.title;
            }
            if ((i8 & 2) != 0) {
                str2 = localizedConfiguration.subtitle;
            }
            if ((i8 & 4) != 0) {
                str3 = localizedConfiguration.callToAction;
            }
            if ((i8 & 8) != 0) {
                str4 = localizedConfiguration.callToActionWithIntroOffer;
            }
            if ((i8 & 16) != 0) {
                str5 = localizedConfiguration.callToActionWithMultipleIntroOffers;
            }
            if ((i8 & 32) != 0) {
                str6 = localizedConfiguration.offerDetails;
            }
            if ((i8 & 64) != 0) {
                str7 = localizedConfiguration.offerDetailsWithIntroOffer;
            }
            if ((i8 & 128) != 0) {
                str8 = localizedConfiguration.offerDetailsWithMultipleIntroOffers;
            }
            if ((i8 & 256) != 0) {
                str9 = localizedConfiguration.offerName;
            }
            if ((i8 & 512) != 0) {
                list = localizedConfiguration.features;
            }
            String str10 = str9;
            List list2 = list;
            String str11 = str7;
            String str12 = str8;
            String str13 = str5;
            String str14 = str6;
            return localizedConfiguration.copy(str, str2, str3, str4, str13, str14, str11, str12, str10, list2);
        }

        public static /* synthetic */ void getCallToAction$annotations() {
        }

        @i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithIntroOffer$annotations() {
        }

        @i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithMultipleIntroOffers$annotations() {
        }

        @i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetails$annotations() {
        }

        @i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
        }

        @i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
        }

        @i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferName$annotations() {
        }

        @i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static final /* synthetic */ void write$Self(LocalizedConfiguration localizedConfiguration, d dVar, f fVar) {
            b[] bVarArr = $childSerializers;
            dVar.q(fVar, 0, localizedConfiguration.title);
            if (dVar.G(fVar, 1) || localizedConfiguration.subtitle != null) {
                dVar.t(fVar, 1, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.subtitle);
            }
            dVar.q(fVar, 2, localizedConfiguration.callToAction);
            if (dVar.G(fVar, 3) || localizedConfiguration.callToActionWithIntroOffer != null) {
                dVar.t(fVar, 3, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithIntroOffer);
            }
            if (dVar.G(fVar, 4) || localizedConfiguration.callToActionWithMultipleIntroOffers != null) {
                dVar.t(fVar, 4, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithMultipleIntroOffers);
            }
            if (dVar.G(fVar, 5) || localizedConfiguration.offerDetails != null) {
                dVar.t(fVar, 5, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetails);
            }
            if (dVar.G(fVar, 6) || localizedConfiguration.offerDetailsWithIntroOffer != null) {
                dVar.t(fVar, 6, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithIntroOffer);
            }
            if (dVar.G(fVar, 7) || localizedConfiguration.offerDetailsWithMultipleIntroOffers != null) {
                dVar.t(fVar, 7, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithMultipleIntroOffers);
            }
            if (dVar.G(fVar, 8) || localizedConfiguration.offerName != null) {
                dVar.t(fVar, 8, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerName);
            }
            if (!dVar.G(fVar, 9) && t.c(localizedConfiguration.features, r.n())) {
                return;
            }
            dVar.i(fVar, 9, bVarArr[9], localizedConfiguration.features);
        }

        public final String component1() {
            return this.title;
        }

        public final List<Feature> component10() {
            return this.features;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final String component3() {
            return this.callToAction;
        }

        public final String component4() {
            return this.callToActionWithIntroOffer;
        }

        public final String component5() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final String component6() {
            return this.offerDetails;
        }

        public final String component7() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String component8() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String component9() {
            return this.offerName;
        }

        public final LocalizedConfiguration copy(String title, String str, String callToAction, String str2, String str3, String str4, String str5, String str6, String str7, List<Feature> features) {
            t.g(title, "title");
            t.g(callToAction, "callToAction");
            t.g(features, "features");
            return new LocalizedConfiguration(title, str, callToAction, str2, str3, str4, str5, str6, str7, features);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalizedConfiguration)) {
                return false;
            }
            LocalizedConfiguration localizedConfiguration = (LocalizedConfiguration) obj;
            return t.c(this.title, localizedConfiguration.title) && t.c(this.subtitle, localizedConfiguration.subtitle) && t.c(this.callToAction, localizedConfiguration.callToAction) && t.c(this.callToActionWithIntroOffer, localizedConfiguration.callToActionWithIntroOffer) && t.c(this.callToActionWithMultipleIntroOffers, localizedConfiguration.callToActionWithMultipleIntroOffers) && t.c(this.offerDetails, localizedConfiguration.offerDetails) && t.c(this.offerDetailsWithIntroOffer, localizedConfiguration.offerDetailsWithIntroOffer) && t.c(this.offerDetailsWithMultipleIntroOffers, localizedConfiguration.offerDetailsWithMultipleIntroOffers) && t.c(this.offerName, localizedConfiguration.offerName) && t.c(this.features, localizedConfiguration.features);
        }

        public final String getCallToAction() {
            return this.callToAction;
        }

        public final String getCallToActionWithIntroOffer() {
            return this.callToActionWithIntroOffer;
        }

        public final String getCallToActionWithMultipleIntroOffers() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final List<Feature> getFeatures() {
            return this.features;
        }

        public final String getOfferDetails() {
            return this.offerDetails;
        }

        public final String getOfferDetailsWithIntroOffer() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String getOfferDetailsWithMultipleIntroOffers() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String getOfferName() {
            return this.offerName;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.callToAction.hashCode()) * 31;
            String str2 = this.callToActionWithIntroOffer;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.callToActionWithMultipleIntroOffers;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.offerDetails;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.offerDetailsWithIntroOffer;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.offerDetailsWithMultipleIntroOffers;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.offerName;
            return ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.features.hashCode();
        }

        public String toString() {
            return "LocalizedConfiguration(title=" + this.title + ", subtitle=" + this.subtitle + ", callToAction=" + this.callToAction + ", callToActionWithIntroOffer=" + this.callToActionWithIntroOffer + ", callToActionWithMultipleIntroOffers=" + this.callToActionWithMultipleIntroOffers + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + OjEsfyJYzbPn.PBynJcAwnM + this.offerDetailsWithMultipleIntroOffers + toqHM.SBEKkuSfpGMuoH + this.offerName + ", features=" + this.features + ')';
        }

        public LocalizedConfiguration(String title, String str, String callToAction, String str2, String str3, String str4, String str5, String str6, String str7, List<Feature> features) {
            t.g(title, "title");
            t.g(callToAction, "callToAction");
            t.g(features, "features");
            this.title = title;
            this.subtitle = str;
            this.callToAction = callToAction;
            this.callToActionWithIntroOffer = str2;
            this.callToActionWithMultipleIntroOffers = str3;
            this.offerDetails = str4;
            this.offerDetailsWithIntroOffer = str5;
            this.offerDetailsWithMultipleIntroOffers = str6;
            this.offerName = str7;
            this.features = features;
        }

        public /* synthetic */ LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i8, AbstractC2633k abstractC2633k) {
            this(str, (i8 & 2) != 0 ? null : str2, str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6, (i8 & 64) != 0 ? null : str7, (i8 & 128) != 0 ? null : str8, (i8 & 256) != 0 ? null : str9, (i8 & 512) != 0 ? r.n() : list);
        }
    }

    @InterfaceC0916e
    public /* synthetic */ PaywallData(int i8, String str, Configuration configuration, @i(with = URLSerializer.class) URL url, int i9, Map map, I0 i10) {
        if (23 != (i8 & 23)) {
            AbstractC2872x0.a(i8, 23, PaywallData$$serializer.INSTANCE.getDescriptor());
        }
        this.templateName = str;
        this.config = configuration;
        this.assetBaseURL = url;
        if ((i8 & 8) == 0) {
            this.revision = 0;
        } else {
            this.revision = i9;
        }
        this.localization = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallData copy$default(PaywallData paywallData, String str, Configuration configuration, URL url, int i8, Map map, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = paywallData.templateName;
        }
        if ((i9 & 2) != 0) {
            configuration = paywallData.config;
        }
        if ((i9 & 4) != 0) {
            url = paywallData.assetBaseURL;
        }
        if ((i9 & 8) != 0) {
            i8 = paywallData.revision;
        }
        if ((i9 & 16) != 0) {
            map = paywallData.localization;
        }
        Map map2 = map;
        URL url2 = url;
        return paywallData.copy(str, configuration, url2, i8, map2);
    }

    @i(with = URLSerializer.class)
    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    private final o getFallbackLocalizedConfiguration() {
        Map.Entry entry = (Map.Entry) z.h0(this.localization.entrySet());
        return v.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
    }

    public static /* synthetic */ void getLocalization$purchases_defaultsRelease$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallData paywallData, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        dVar.q(fVar, 0, paywallData.templateName);
        dVar.i(fVar, 1, PaywallData$Configuration$$serializer.INSTANCE, paywallData.config);
        dVar.i(fVar, 2, URLSerializer.INSTANCE, paywallData.assetBaseURL);
        if (dVar.G(fVar, 3) || paywallData.revision != 0) {
            dVar.u(fVar, 3, paywallData.revision);
        }
        dVar.i(fVar, 4, bVarArr[4], paywallData.localization);
    }

    public final String component1() {
        return this.templateName;
    }

    public final Configuration component2() {
        return this.config;
    }

    public final URL component3() {
        return this.assetBaseURL;
    }

    public final int component4() {
        return this.revision;
    }

    public final Map<String, LocalizedConfiguration> component5$purchases_defaultsRelease() {
        return this.localization;
    }

    public final LocalizedConfiguration configForLocale(Locale requiredLocale) {
        Object next;
        t.g(requiredLocale, "requiredLocale");
        LocalizedConfiguration localizedConfiguration = this.localization.get(requiredLocale.toString());
        if (localizedConfiguration != null) {
            return localizedConfiguration;
        }
        Iterator<T> it = this.localization.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!LocaleExtensionsKt.sharedLanguageCodeWith(requiredLocale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey())));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (LocalizedConfiguration) entry.getValue();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallData)) {
            return false;
        }
        PaywallData paywallData = (PaywallData) obj;
        return t.c(this.templateName, paywallData.templateName) && t.c(this.config, paywallData.config) && t.c(this.assetBaseURL, paywallData.assetBaseURL) && this.revision == paywallData.revision && t.c(this.localization, paywallData.localization);
    }

    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final Map<String, LocalizedConfiguration> getLocalization$purchases_defaultsRelease() {
        return this.localization;
    }

    public final o getLocalizedConfiguration() {
        return localizedConfiguration(LocaleExtensionsKt.getDefaultLocales());
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        return (((((((this.templateName.hashCode() * 31) + this.config.hashCode()) * 31) + this.assetBaseURL.hashCode()) * 31) + Integer.hashCode(this.revision)) * 31) + this.localization.hashCode();
    }

    public final o localizedConfiguration(List<Locale> locales) {
        t.g(locales, "locales");
        Iterator<Locale> it = locales.iterator();
        while (it.hasNext()) {
            Locale localeConvertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(it.next());
            LocalizedConfiguration localizedConfigurationConfigForLocale = configForLocale(localeConvertToCorrectlyFormattedLocale);
            if (localizedConfigurationConfigForLocale != null) {
                return v.a(localeConvertToCorrectlyFormattedLocale, localizedConfigurationConfigForLocale);
            }
        }
        return getFallbackLocalizedConfiguration();
    }

    public String toString() {
        return "PaywallData(templateName=" + this.templateName + ", config=" + this.config + ", assetBaseURL=" + this.assetBaseURL + ", revision=" + this.revision + ", localization=" + this.localization + ')';
    }

    public PaywallData(String templateName, Configuration config, URL assetBaseURL, int i8, Map<String, LocalizedConfiguration> localization) {
        t.g(templateName, "templateName");
        t.g(config, "config");
        t.g(assetBaseURL, "assetBaseURL");
        t.g(localization, "localization");
        this.templateName = templateName;
        this.config = config;
        this.assetBaseURL = assetBaseURL;
        this.revision = i8;
        this.localization = localization;
    }

    public final PaywallData copy(String templateName, Configuration config, URL url, int i8, Map<String, LocalizedConfiguration> localization) {
        t.g(templateName, "templateName");
        t.g(config, "config");
        t.g(url, GOKsbdzhLhXAMt.aiRAs);
        t.g(localization, "localization");
        return new PaywallData(templateName, config, url, i8, localization);
    }

    public /* synthetic */ PaywallData(String str, Configuration configuration, URL url, int i8, Map map, int i9, AbstractC2633k abstractC2633k) {
        this(str, configuration, url, (i9 & 8) != 0 ? 0 : i8, map);
    }
}
