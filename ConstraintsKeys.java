package io.virtualdruid.artc.mediaconstraints;

/**
 * available keys for {@link org.webrtc.MediaConstraints.KeyValuePair}
 * from mediaconstraintsinterface.cc at master branch
 *
 * @see <a href="https://chromium.googlesource.com/external/webrtc/+/master/api/mediaconstraintsinterface.cc">src</a>
 *
 * <p>
 * constraints values contains following 3 type:
 * <p>
 * 1.boolean
 * 2.int
 * 3.double
 * <p>
 * they need to be convert to string when set to media constraints.
 * <p>
 * This class only works as storing constant keys,and thus should not be constructed
 */
@SuppressWarnings("unused")
public final class ConstraintsKeys {
    private ConstraintsKeys() {
    }

    /***
     * Video constraints keys
     */
    //double
    public static final String KEY_MAX_ASPECT_RATIO = "maxAspectRatio";
    public static final String KEY_MIN_ASPECT_RATIO = "minAspectRatio";

    //int
    public static final String KEY_MAX_WIDTH = "maxWidth";
    public static final String KEY_MIN_WIDTH = "minWidth";
    public static final String KEY_MAX_HEIGHT = "maxHeight";
    public static final String KEY_MIN_HEIGHT = "minHeight";
    public static final String KEY_MAX_FRAME_RATE = "maxFrameRate";
    public static final String KEY_MIN_FRAME_RATE = "minFrameRate";

    //boolean
    //optional
    //google specified video constraint
    public static final String KEY_GOOGLE_NOISE_REDUCTION = "googNoiseReduction";


    /***
     * Audio constraints keys, all of them are optional and boolean type
     */
    //boolean
    public static final String KEY_ECHO_CANCELLATION = "echoCancellation";
    public static final String KEY_GOOGLE_ECHO_CANCELLATION = "googEchoCancellation";
    public static final String KEY_GOOGLE_ECHO_CANCELLATION_2 = "googEchoCancellation2";
    public static final String KEY_GOOGLE_DA_ECHO_CANCELLATION = "googDAEchoCancellation";
    public static final String KEY_GOOGLE_AUTO_GAIN_CONTROL = "googAutoGainControl";
    public static final String KEY_GOOGLE_AUTO_GAIN_CONTROL_2 = "googAutoGainControl2";
    public static final String KEY_GOOGLE_NOISE_SUPPRESSION = "googNoiseSuppression";
    public static final String KEY_GOOGLE_NOISE_SUPPRESSION_2 = "googNoiseSuppression2";
    public static final String KEY_GOOGLE_HIGHPASS_FILTER = "googHighpassFilter";
    public static final String KEY_GOOGLE_TYPING_NOISE_DETECTION = "googTypingNoiseDetection";
    public static final String KEY_GOOGLE_AUDIO_MIRRORING = "googAudioMirroring";
    public static final String KEY_GOOGLE_AUDIO_NETWORK_ADAPTOR_CONFIG = "googAudioNetworkAdaptorConfig";


    /***
     * Answer/Offer constraints keys, all are boolean type
     */
    //boolean
    //mandatory
    public static final String KEY_OFFER_TO_RECEIVE_VIDEO = "OfferToReceiveVideo";
    public static final String KEY_OFFER_TO_RECEIVE_AUDIO = "OfferToReceiveAudio";
    //boolean
    //optional
    public static final String KEY_VOICE_ACTIVITY_DETECTION = "VoiceActivityDetection";
    public static final String KEY_ICE_RESTART = "IceRestart";
    public static final String KEY_GOOGLE_USE_RTP_MUX = "googUseRtpMUX";


    /***
     * PeerConnection construction constraints (non-int are boolean type)
     */
    //boolean
    //optional
    public static final String KEY_DTLS_SRTP_KEY_AGREEMENT = "DtlsSrtpKeyAgreement";
    //mandatory
    public static final String KEY_RTP_DATA_CHANNELS = "RtpDataChannels";
    public static final String KEY_GOOGLE_DSCP = "googDscp";
    public static final String KEY_GOOGLE_IPV6 = "googIPv6";
    public static final String KEY_GOOGLE_SUSPEND_BELOW_MIN_BITRATE = "googSuspendBelowMinBitrate";
    public static final String KEY_GOOGLE_COMBINED_AUDIO_VIDEO_BWE = "googCombinedAudioVideoBwe";

    //int
    public static final String KEY_GOOGLE_SCREENCAST_MIN_BITRATE = "googScreencastMinBitrate";

    //boolean
    public static final String KEY_GOOGLE_CPU_OVERUSE_DETECTION = "googCpuOveruseDetection";
    public static final String KEY_GOOGLE_PAYLOAD_PADDING = "googPayloadPadding";

    //int
    public static final String KEY_GOOGLE_NUM_SIMULCAST_LAYERS = "googNumSimulcastLayers";

}
