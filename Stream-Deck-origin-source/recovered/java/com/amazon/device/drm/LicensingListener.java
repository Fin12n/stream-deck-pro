package com.amazon.device.drm;

import com.amazon.device.drm.model.LicenseResponse;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface LicensingListener {
    void onLicenseCommandResponse(LicenseResponse licenseResponse);
}
