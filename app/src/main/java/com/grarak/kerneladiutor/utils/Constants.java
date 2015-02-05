/*
 * Copyright (C) 2015 Willi Ye
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.grarak.kerneladiutor.utils;

/**
 * Created by willi on 30.11.14.
 */
public interface Constants {

    public final String TAG = "Kernel Adiutor";
    public final String PREF_NAME = "prefs";

    // Kernel Informations
    public final String PROC_VERSION = "/proc/version";
    public final String PROC_CPUINFO = "/proc/cpuinfo";
    public final String PROC_MEMINFO = "/proc/meminfo";

    // CPU
    public final String CPU_CUR_FREQ = "/sys/devices/system/cpu/cpu%d/cpufreq/scaling_cur_freq";
    public final String CPU_CORE_ONLINE = "/sys/devices/system/cpu/cpu%d/online";
    public final String CPU_MAX_FREQ = "/sys/devices/system/cpu/cpu%d/cpufreq/scaling_max_freq";
    public final String CPU_MIN_FREQ = "/sys/devices/system/cpu/cpu%d/cpufreq/scaling_min_freq";
    public final String CPU_MAX_SCREEN_OFF_FREQ = "/sys/devices/system/cpu/cpu%d/cpufreq/screen_off_max_freq";
    public final String CPU_MSM_CPUFREQ_LIMIT = "/sys/kernel/msm_cpufreq_limit/cpufreq_limit";
    public final String CPU_AVAILABLE_FREQS = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_available_frequencies";
    public final String CPU_TIME_STATE = "/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state";
    public final String CPU_SCALING_GOVERNOR = "/sys/devices/system/cpu/cpu%d/cpufreq/scaling_governor";
    public final String CPU_AVAILABLE_GOVERNORS = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_available_governors";
    public final String CPU_GOVERNOR_TUNABLES = "/sys/devices/system/cpu/cpufreq/%s";
    public final String CPU_MC_POWER_SAVING = "/sys/devices/system/cpu/sched_mc_power_savings";
    public final String CPU_MPDECISION_BINARY = "/system/bin/mpdecision";
    public final String CPU_MPDEC = "mpdecision";
    public final String CPU_INTELLI_PLUG = "/sys/module/intelli_plug/parameters/intelli_plug_active";
    public final String CPU_INTELLI_PLUG_ECO = "/sys/module/intelli_plug/parameters/eco_mode_active";

    public final String[] CPU_ARRAY = new String[]{CPU_CUR_FREQ, CPU_CORE_ONLINE, CPU_MAX_FREQ, CPU_MIN_FREQ,
            CPU_MAX_SCREEN_OFF_FREQ, CPU_MSM_CPUFREQ_LIMIT, CPU_AVAILABLE_FREQS, CPU_TIME_STATE, CPU_SCALING_GOVERNOR,
            CPU_AVAILABLE_GOVERNORS, CPU_GOVERNOR_TUNABLES, CPU_MC_POWER_SAVING, CPU_MPDECISION_BINARY, CPU_MPDEC,
            CPU_INTELLI_PLUG, CPU_INTELLI_PLUG_ECO};

    // CPU Voltage
    public final String CPU_VOLTAGE = "/sys/devices/system/cpu/cpu0/cpufreq/UV_mV_table";
    public final String CPU_FAUX_VOLTAGE = "/sys/devices/system/cpu/cpufreq/vdd_table/vdd_levels";

    public final String[] CPU_VOLTAGE_ARRAY = new String[]{
            CPU_VOLTAGE, CPU_FAUX_VOLTAGE
    };

    // GPU
    public final String GPU_GENERIC_GOVERNORS = "performance powersave ondemand simple";

    public final String GPU_CUR_KGSL2D0_QCOM_FREQ = "/sys/devices/platform/kgsl-2d0.0/kgsl/kgsl-2d0/gpuclk";
    public final String GPU_MAX_KGSL2D0_QCOM_FREQ = "/sys/devices/platform/kgsl-2d0.0/kgsl/kgsl-2d0/max_gpuclk";
    public final String GPU_AVAILABLE_KGSL2D0_QCOM_FREQS = "/sys/devices/platform/kgsl-2d0.0/kgsl/kgsl-2d0/gpu_available_frequencies";
    public final String GPU_SCALING_KGSL2D0_QCOM_GOVERNOR = "/sys/devices/platform/kgsl-2d0.0/kgsl/kgsl-2d0/pwrscale/trustzone/governor";

    public final String GPU_CUR_KGSL3D0_QCOM_FREQ = "/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/gpuclk";
    public final String GPU_MAX_KGSL3D0_QCOM_FREQ = "/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/max_gpuclk";
    public final String GPU_AVAILABLE_KGSL3D0_QCOM_FREQS = "/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/gpu_available_frequencies";
    public final String GPU_SCALING_KGSL3D0_QCOM_GOVERNOR = "/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/pwrscale/trustzone/governor";

    public final String GPU_CUR_FDB00000_QCOM_FREQ = "/sys/devices/fdb00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/devfreq/cur_freq";
    public final String GPU_MAX_FDB00000_QCOM_FREQ = "/sys/devices/fdb00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/max_gpuclk";
    public final String GPU_AVAILABLE_FDB00000_QCOM_FREQS = "/sys/devices/fdb00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/gpu_available_frequencies";
    public final String GPU_SCALING_FDB00000_QCOM_GOVERNOR = "/sys/devices/fdb00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/devfreq/governor";
    public final String GPU_AVAILABLE_FDB00000_QCOM_GOVERNORS = "/sys/devices/fdb00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/devfreq/available_governors";

    public final String GPU_CUR_OMAP_FREQ = "/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/frequency";
    public final String GPU_MAX_OMAP_FREQ = "/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/frequency_limit";
    public final String GPU_AVAILABLE_OMAP_FREQS = "/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/frequency_list";
    public final String GPU_SCALING_OMAP_GOVERNOR = "/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/governor";
    public final String GPU_AVAILABLE_OMAP_GOVERNORS = "/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/governor_list";

    public final String[] GPU_2D_CUR_FREQ_ARRAY = new String[]{GPU_CUR_KGSL2D0_QCOM_FREQ};

    public final String[] GPU_2D_MAX_FREQ_ARRAY = new String[]{GPU_MAX_KGSL2D0_QCOM_FREQ};

    public final String[] GPU_2D_AVAILABLE_FREQS_ARRAY = new String[]{GPU_AVAILABLE_KGSL2D0_QCOM_FREQS};

    public final String[] GPU_2D_SCALING_GOVERNOR_ARRAY = new String[]{GPU_SCALING_KGSL2D0_QCOM_GOVERNOR};

    public final String[] GPU_CUR_FREQ_ARRAY = new String[]{GPU_CUR_KGSL3D0_QCOM_FREQ, GPU_CUR_FDB00000_QCOM_FREQ,
            GPU_CUR_OMAP_FREQ};

    public final String[] GPU_MAX_FREQ_ARRAY = new String[]{GPU_MAX_KGSL3D0_QCOM_FREQ, GPU_MAX_FDB00000_QCOM_FREQ,
            GPU_MAX_OMAP_FREQ};

    public final String[] GPU_AVAILABLE_FREQS_ARRAY = new String[]{GPU_AVAILABLE_KGSL3D0_QCOM_FREQS,
            GPU_AVAILABLE_FDB00000_QCOM_FREQS, GPU_AVAILABLE_OMAP_FREQS};

    public final String[] GPU_SCALING_GOVERNOR_ARRAY = new String[]{GPU_SCALING_KGSL3D0_QCOM_GOVERNOR,
            GPU_SCALING_FDB00000_QCOM_GOVERNOR, GPU_SCALING_OMAP_GOVERNOR};

    public final String[] GPU_AVAILABLE_GOVERNORS_ARRAY = new String[]{GPU_AVAILABLE_FDB00000_QCOM_GOVERNORS,
            GPU_AVAILABLE_OMAP_GOVERNORS};

    public final String[][] GPU_ARRAY = new String[][]{GPU_2D_CUR_FREQ_ARRAY,
            GPU_2D_MAX_FREQ_ARRAY, GPU_2D_AVAILABLE_FREQS_ARRAY,
            GPU_2D_SCALING_GOVERNOR_ARRAY, GPU_CUR_FREQ_ARRAY,
            GPU_MAX_FREQ_ARRAY, GPU_AVAILABLE_FREQS_ARRAY,
            GPU_SCALING_GOVERNOR_ARRAY};

    // Screen
    public final String SCREEN_KCAL = "/sys/devices/platform/kcal_ctrl.0";
    public final String SCREEN_KCAL_CTRL = SCREEN_KCAL + "/kcal";
    public final String SCREEN_KCAL_CTRL_CTRL = SCREEN_KCAL + "/kcal_ctrl";

    public final String SCREEN_DIAG0 = "/sys/devices/platform/DIAG0.0";
    public final String SCREEN_DIAG0_POWER = SCREEN_DIAG0 + "/power_rail";
    public final String SCREEN_DIAG0_POWER_CTRL = SCREEN_DIAG0 + "/power_rail_ctrl";

    public final String SCREEN_COLOR = "/sys/class/misc/colorcontrol";
    public final String SCREEN_COLOR_CONTROL = SCREEN_COLOR + "/multiplier";
    public final String SCREEN_COLOR_CONTROL_CTRL = SCREEN_COLOR + "/safety_enabled";

    public final String SCREEN_SAMOLED_COLOR = "/sys/class/misc/samoled_color";
    public final String SCREEN_SAMOLED_COLOR_RED = SCREEN_SAMOLED_COLOR + "/red_multiplier";
    public final String SCREEN_SAMOLED_COLOR_GREEN = SCREEN_SAMOLED_COLOR + "/green_multiplier";
    public final String SCREEN_SAMOLED_COLOR_BLUE = SCREEN_SAMOLED_COLOR + "/blue_multiplier";

    public final String[] SCREEN_KCAL_ARRAY = {SCREEN_KCAL_CTRL, SCREEN_DIAG0_POWER, SCREEN_COLOR_CONTROL,
            SCREEN_SAMOLED_COLOR_RED};

    public final String[] SCREEN_KCAL_CTRL_ARRAY = {SCREEN_KCAL_CTRL_CTRL, SCREEN_DIAG0_POWER_CTRL,
            SCREEN_COLOR_CONTROL_CTRL};

    public final String[] SCREEN_ARRAY = {SCREEN_KCAL, SCREEN_DIAG0, SCREEN_COLOR, SCREEN_SAMOLED_COLOR};

    // Wake

    // DT2W
    public final String LGE_TOUCH_DT2W = "/sys/devices/virtual/input/lge_touch/dt_wake_enabled";
    public final String LGE_TOUCH_CORE_DT2W = "/sys/module/lge_touch_core/parameters/doubletap_to_wake";
    public final String DT2W = "/sys/android_touch/doubletap2wake";
    public final String TOUCH_PANEL_DT2W = "/proc/touchpanel/double_tap_enable";

    public final String[] DT2W_ARRAY = new String[]{LGE_TOUCH_DT2W, LGE_TOUCH_CORE_DT2W, DT2W, TOUCH_PANEL_DT2W};

    // S2W
    public final String S2W_ONLY = "/sys/android_touch/s2w_s2sonly";
    public final String SW2 = "/sys/android_touch/sweep2wake";

    public final String[] S2W_ARRY = new String[]{S2W_ONLY, SW2};

    // T2W
    public final String TSP_T2W = "/sys/devices/f9966000.i2c/i2c-1/1-004a/tsp";
    public final String TOUCHWAKE_T2W = "/sys/class/misc/touchwake/enabled";

    public final String[] T2W_ARRAY = new String[]{TSP_T2W, TOUCHWAKE_T2W};

    public final String[][] WAKE_ARRAY = new String[][]{DT2W_ARRAY, S2W_ARRY, T2W_ARRAY};

    // Sound
    public final String HEADPHONE_GAIN = "/sys/kernel/sound_control_3/gpl_headphone_gain";
    public final String HANDSET_MICROPONE_GAIN = "/sys/kernel/sound_control_3/gpl_mic_gain";
    public final String CAM_MICROPHONE_GAIN = "/sys/kernel/sound_control_3/gpl_cam_mic_gai";
    public final String SPEAKER_GAIN = "/sys/kernel/sound_control_3/gpl_speaker_gain";
    public final String HEADPHONE_POWERAMP_GAIN = "/sys/kernel/sound_control_3/gpl_headphone_pa_gain";

    public final String[] SOUND_ARRAY = new String[]{
            HEADPHONE_GAIN, HANDSET_MICROPONE_GAIN, CAM_MICROPHONE_GAIN, SPEAKER_GAIN, HEADPHONE_POWERAMP_GAIN
    };

    // Battery
    public final String FORCE_FAST_CHARGE = "/sys/kernel/fast_charge/force_fast_charge";
    public final String BLX = "/sys/devices/virtual/misc/batterylifeextender/charging_limit";

    public final String[] BATTERY_ARRAY = new String[]{
            FORCE_FAST_CHARGE, BLX
    };

    // I/O
    public final String IO_INTERNAL_SCHEDULER = "/sys/block/mmcblk0/queue/scheduler";
    public final String IO_EXTERNAL_SCHEDULER = "/sys/block/mmcblk1/queue/scheduler";
    public final String IO_INTERNAL_SCHEDULER_TUNABLE = "/sys/block/mmcblk0/queue/iosched";
    public final String IO_EXTERNAL_SCHEDULER_TUNABLE = "/sys/block/mmcblk1/queue/iosched";
    public final String IO_INTERNAL_READ_AHEAD = "/sys/block/mmcblk0/queue/read_ahead_kb";
    public final String IO_EXTERNAL_READ_AHEAD = "/sys/block/mmcblk1/queue/read_ahead_kb";

    public final String[] IO_ARRAY = new String[]{
            IO_INTERNAL_SCHEDULER, IO_EXTERNAL_SCHEDULER, IO_INTERNAL_SCHEDULER_TUNABLE, IO_EXTERNAL_SCHEDULER_TUNABLE,
            IO_INTERNAL_READ_AHEAD, IO_EXTERNAL_READ_AHEAD
    };

    // Kernel Samepage Merging
    public final String KSM_FOLDER = "/sys/kernel/mm/ksm";
    public final String KSM_FULL_SCANS = KSM_FOLDER + "/full_scans";
    public final String KSM_PAGES_SHARED = KSM_FOLDER + "/pages_shared";
    public final String KSM_PAGES_SHARING = KSM_FOLDER + "/pages_sharing";
    public final String KSM_PAGES_UNSHARED = KSM_FOLDER + "/pages_unshared";
    public final String KSM_PAGES_VOLATILE = KSM_FOLDER + "/pages_volatile";
    public final String KSM_RUN = KSM_FOLDER + "/run";
    public final String KSM_PAGES_TO_SCAN = KSM_FOLDER + "/pages_to_scan";
    public final String KSM_SLEEP_MILLISECONDS = KSM_FOLDER + "/sleep_millisecs";

    public final String[] KSM_INFOS = new String[]{KSM_FULL_SCANS, KSM_PAGES_SHARED, KSM_PAGES_SHARING, KSM_PAGES_UNSHARED,
            KSM_PAGES_VOLATILE};

    // Low Memory Killer
    public final String LMK_MINFREE = "/sys/module/lowmemorykiller/parameters/minfree";

    // Virtual Machine
    public final String VM_PATH = "/proc/sys/vm";

    public final String[] SUPPORTED_VM = {"dirty_ratio",
            "dirty_background_ratio", "dirty_expire_centisecs",
            "dirty_writeback_centisecs", "min_free_kbytes", "overcommit_ratio",
            "swappiness", "vfs_cache_pressure"};

    // Misc

    // TCP
    public final String TCP_AVAILABLE_CONGESTIONS = "/proc/sys/net/ipv4/tcp_available_congestion_control";

    // Vibration
    public final String[] VIBRATION_ARRAY = new String[]{
            "/sys/vibrator/pwmvalue",
            "/sys/class/timed_output/vibrator/amp",
            "/sys/class/timed_output/vibrator/vtg_level",
            "/sys/devices/platform/tspdrv/nforce_timed",
            "/sys/devices/virtual/timed_output/vibrator/vtg_level",
            "/sys/class/timed_output/vibrator/pwm_value",
            "/sys/devices/i2c-3/3-0033/vibrator/vib0/vib_duty_cycle",
            "/sys/devices/virtual/timed_output/vibrator/voltage_level",
            "/sys/devices/virtual/timed_output/vibrator/pwm_value_1p"
    };

    public final Integer[][] VIBRATION_MAX_MIN_ARRAY = new Integer[][]{
            new Integer[]{127, 0},
            new Integer[]{100, 0},
            new Integer[]{0, 0}, // Read MAX MIN from sys
            new Integer[]{127, 1},
            new Integer[]{31, 12},
            new Integer[]{100, 0}, // Read MAX MIN from sys
            new Integer[]{100, 25}, // Needs enable path
            new Integer[]{3199, 1200},
            new Integer[]{99, 53}
    };

    public final String[][] MISC_ARRAY = new String[][]{
            new String[]{TCP_AVAILABLE_CONGESTIONS},
            VIBRATION_ARRAY
    };

    // Build prop
    public final String BUILD_PROP = "/system/build.prop";

}
