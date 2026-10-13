package com.elgato.streamdeck.vsd2;

import C6.G;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.t;
import p048f2.B;
import p048f2.C2302e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class AppSettingsSerializer implements B {
    public static final AppSettingsSerializer INSTANCE = new AppSettingsSerializer();
    private static final AppSettings defaultValue;

    static {
        AppSettings defaultInstance = AppSettings.getDefaultInstance();
        t.f(defaultInstance, "getDefaultInstance(...)");
        defaultValue = defaultInstance;
    }

    private AppSettingsSerializer() {
    }

    @Override // p048f2.B
    public Object readFrom(InputStream inputStream, G6.d<? super AppSettings> dVar) throws C2302e {
        try {
            AppSettings from = AppSettings.parseFrom(inputStream);
            t.f(from, "parseFrom(...)");
            return from;
        } catch (com.google.protobuf.B e8) {
            throw new C2302e("Cannot read proto.", e8);
        }
    }

    @Override // p048f2.B
    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, G6.d dVar) {
        return writeTo((AppSettings) obj, outputStream, (G6.d<? super G>) dVar);
    }

    @Override // p048f2.B
    public AppSettings getDefaultValue() {
        return defaultValue;
    }

    public Object writeTo(AppSettings appSettings, OutputStream outputStream, G6.d<? super G> dVar) {
        appSettings.writeTo(outputStream);
        return G.f1419a;
    }
}
