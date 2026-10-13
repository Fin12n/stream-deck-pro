package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DebugImage implements InterfaceC2582w0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage a(W0 w8, ILogger iLogger) {
            DebugImage debugImage = new DebugImage();
            w8.x();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "debug_file":
                        debugImage.debugFile = w8.k0();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = w8.k0();
                        break;
                    case "image_size":
                        debugImage.imageSize = w8.a0();
                        break;
                    case "code_file":
                        debugImage.codeFile = w8.k0();
                        break;
                    case "arch":
                        debugImage.arch = w8.k0();
                        break;
                    case "type":
                        debugImage.type = w8.k0();
                        break;
                    case "uuid":
                        debugImage.uuid = w8.k0();
                        break;
                    case "debug_id":
                        debugImage.debugId = w8.k0();
                        break;
                    case "code_id":
                        debugImage.codeId = w8.k0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        w8.t0(iLogger, map, strF0);
                        break;
                }
            }
            w8.u();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.uuid != null) {
            x8.k("uuid").c(this.uuid);
        }
        if (this.type != null) {
            x8.k("type").c(this.type);
        }
        if (this.debugId != null) {
            x8.k("debug_id").c(this.debugId);
        }
        if (this.debugFile != null) {
            x8.k("debug_file").c(this.debugFile);
        }
        if (this.codeId != null) {
            x8.k("code_id").c(this.codeId);
        }
        if (this.codeFile != null) {
            x8.k("code_file").c(this.codeFile);
        }
        if (this.imageAddr != null) {
            x8.k("image_addr").c(this.imageAddr);
        }
        if (this.imageSize != null) {
            x8.k("image_size").f(this.imageSize);
        }
        if (this.arch != null) {
            x8.k("arch").c(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.unknown.get(str));
            }
        }
        x8.u();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l8) {
        this.imageSize = l8;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j8) {
        this.imageSize = Long.valueOf(j8);
    }
}
