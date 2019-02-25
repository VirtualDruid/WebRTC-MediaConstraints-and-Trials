package io.virtualdruid.artc.utils;


import android.support.annotation.NonNull;

import static org.webrtc.PeerConnectionFactory.TRIAL_ENABLED;

/***
 * experiment features from src
 */
public class Trials {

    private Trials() {
    }

    /***
     * peerconnectionfactory.cc
     */
    public static final String RTC_EVENT_LOG_NEW_FORMAT = "WebRTC-RtcEventLogNewFormat";
    public static final String BWE_INJECTED_CONGESTION_CONTROLLE = "WebRTC-Bwe-InjectedCongestionControlle";

    /**
     * webrtc_voice_engine.cc
     */
    public static final String AUDIO_MINIMIZE_RESAMPLING_ON_MOBILE = "WebRTC-Audio-MinimizeResamplingOnMobile";

    /***
     * webrtc_video_engine.cc
     */
    public static final String FLEX_FEC_03 = "WebRTC-FlexFEC-03";
    public static final String FLEX_FEC_03_ADVERTISED = "WebRTC-FlexFEC-03-Advertised";
    public static final String H264_SIMULCAST = "WebRTC-H264Simulcast";
    public static final String SUPPORT_VP9_SVC = "WebRTC-SupportVP9SVC";
    public static final String VP8_FORCED_FALLBACK_ENCODER_V2 = "WebRTC-VP8-Forced-Fallback-Encoder-v2";
    public static final String GENERIC_DESCRIPTOR_ADVERTISED = "WebRTC-GenericDescriptorAdvertised";
    public static final String VIDEO_DISCARD_PACKETS_WITH_UNKNOWN_SSRC = "WebRTC-Video-DiscardPacketsWithUnknownSsrc";
    public static final String VIDEO_BALANCED_DEGRADATION = "WebRTC-Video-BalancedDegradation";

    /***
     * simulcast_encoder_adapter.cc
     */
    public static final String BOOSTED_SCREENSHAREQ = "WebRTC-BoostedScreenshareQp";

    /***
     * simulcast.cc
     */
    public static final String VP8_SCREEN_SHARE = "WebRTC-VP8ScreenshareTemporalLayers";
    public static final String VP8_CONFERENCE = "WebRTC-VP8ConferenceTemporalLayers";
    public static final String SIMULCAST_MAX_LAYERS = "WebRTC-SimulcastMaxLayers";
    public static final String USE_BASE_HEAVY_VP8_TL3_RATE_ALLOCATION = "WebRTC-UseBaseHeavyVP8TL3RateAllocation";
    public static final String SIMULCAST_SCREENSHARE = "WebRTC-SimulcastScreenshare";

    /***
     *webrtc_media_engine.cc
     */
    public static final String KEEP_ABS_SEND_TIME_EXTENSION = "WebRTC-KeepAbsSendTimeExtension";
    /***
     * buffered_frame_decryptor.cc
     */
    public static final String GENERIC_DESCRIPTOR_AUTH = "WebRTC-GenericDescriptorAuth";
    /***
     *  overuse_frame_detector.cc
     */
    public static final String FORCE_SIMULATED_OVERUSE_INTERVAL_MS = "WebRTC-ForceSimulatedOveruseIntervalMs";

    /***
     * send_statistics_proxy.cc
     */
//    public static final String WEB_RTC_VP8_FORCED_FALLBACK_ENCODER_V2 = "WebRTC-VP8-Forced-Fallback-Encoder-v2";

    /**
     * video_receive_stream.cc
     */
    public static final String DECODER_DATA_DUMP_DIRECTORY = "WebRTC-DecoderDataDumpDirectory";

    /***
     * video_send_stream_impl.cc
     */
//    public static final String WEB_RTC_VP8_FORCED_FALLBACK_ENCODER_V2 = "WebRTC-VP8-Forced-Fallback-Encoder-v2";
    public static final String VIDEO_PACING = "WebRTC-Video-Pacing";
    /***
     * video_stream_encoder.cc
     */
    public static final String INITIAL_FRAMEDROP = "WebRTC-InitialFramedrop";
    public static final String FRAME_DROPPER = "WebRTC-FrameDropper";

    /***
     * p2p_transport_channel.cc
     */
    public static final String STUN_INTER_PACKET_DELAY = "WebRTC-StunInterPacketDelay";
    public static final String EXTRA_ICE_PING = "WebRTC-ExtraICEPing";

    /**
     * stun_request.cc
     */
    public static final String RFC5389_STUN_RETRANSMISSIONS = "WebRTC-Rfc5389StunRetransmissions";
    /***
     * cpu_speed_experiment.cc
     */
    public static final String VP8_CPU_SPEED_ARM = "WebRTC-VP8-CpuSpeed-Arm";
    /***
     *  alr_experiment.cc
     */
    public static final String PROBING_SCREENSHARE_BWE = "WebRTC-ProbingScreenshareBwe";
    public static final String STRICT_PACING_AND_PROBING = "WebRTC-StrictPacingAndProbing";

    public static final String RTT_MULT = "WebRTC-RttMult";

    /**
     * jitter_upper_bound_experiment.cc
     */
    public static final String JITTER_UPPER_BOUND = "WebRTC-JitterUpperBound";

    /***
     * normalize_simulcast_size_experiment.cc
     */
    public static final String NORMALIZE_SIMULCAST_RESOLUTION = "WebRTC-NormalizeSimulcastResolution";
    /***
     * quality_scaling_experiment.cc
     */
    public static final String VIDEO_QUALITY_SCALING = "WebRTC-Video-QualityScaling";
    /**
     * rate_control_settings.cc
     */
    public static final String CWND_EXPERIMENT = "WebRTC-CwndExperiment";
    public static final String CONGESTION_WINDOW_PUSHBACK = "WebRTC-CongestionWindowPushback";
    public static final String LIBVPX_VP8_TRUSTED_RATE_CONTROLLER = "WebRTC-LibvpxVp8TrustedRateController";
    public static final String LIBVPX_VP9_TRUSTED_RATE_CONTROLLER = "WebRTC-LibvpxVp9TrustedRateController";
    public static final String SIMULCAST_UPSWITCH_HYSTERESIS_PERCENT = "WebRTC-SimulcastUpswitchHysteresisPercent";
    public static final String SIMULCAST_SCREENSHARE_UPSWITCH_HYSTERESIS_PERCENT = "WebRTC-SimulcastScreenshareUpswitchHysteresisPercent";
    public static final String VIDEO_RATE_CONTROL = "WebRTC-VideoRateControl";

    /***
     * audio_allocation_settings.cc
     */
    public static final String AUDIO_SEND_SIDE_BWE = "WebRTC-Audio-SendSideBwe";
    public static final String AUDIO_ABWENO_TWCC = "WebRTC-Audio-ABWENoTWCC";
    public static final String AUDIO_FORCE_NO_TWCC = "WebRTC-Audio-ForceNoTWCC";
    public static final String AUDIO_SEND_SIDE_BWE_FOR_VIDEO = "WebRTC-Audio-SendSideBwe-For-Video";
    public static final String SEND_SIDE_BWE_WITH_OVERHEAD = "WebRTC-SendSideBwe-WithOverhead";
    public static final String AUDIO_ALLOCATION = "WebRTC-Audio-Allocation";


    /***
     * trials string format is : WebRTC-{$Feature}/Enabled/WebRTC-{$Feature}/Enabled/
     */
    public static class Builder {
        private StringBuilder stringBuilder = new StringBuilder();
        private static final char SEPARATOR = '/';

        public Builder() {
        }

        /***
         * @param trial this value must from {@link Trials} values or webrtc src
         */
        public Builder enable(String trial) {
            stringBuilder.append(trial);
            stringBuilder.append(SEPARATOR);
            stringBuilder.append(TRIAL_ENABLED);
            stringBuilder.append(SEPARATOR);
            return this;
        }

        @NonNull
        @Override
        public String toString() {
            return stringBuilder.toString();
        }
    }
}
