package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.e;
import p155r4.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i8 = jobParameters.getExtras().getInt("priority");
        int i9 = jobParameters.getExtras().getInt("attemptNumber");
        TransportRuntime.f(getApplicationContext());
        e.a aVarD = e.a().b(string).d(a.b(i8));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        TransportRuntime.c().e().m(aVarD.a(), i9, new Runnable() { // from class: n4.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f30581a.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
