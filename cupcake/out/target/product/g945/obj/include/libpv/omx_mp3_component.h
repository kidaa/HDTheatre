/* ------------------------------------------------------------------
 * Copyright (C) 2008 PacketVideo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 * -------------------------------------------------------------------
 */
/**
	@file omx_mp3_component.h
	OpenMax decoder_component component.

*/

#ifndef OMX_MP3_COMPONENT_H_INCLUDED
#define OMX_MP3_COMPONENT_H_INCLUDED

#ifndef OMX_Component_h
#include "omx_component.h"
#endif

#ifndef MP3_DEC_H_INCLUDED
#include "mp3_dec.h"
#endif

#ifndef OSCL_SCHEDULER_H_INCLUDED
#include "oscl_scheduler.h"
#endif

#ifndef PVLOGGER_H_INCLUDED
#include "pvlogger.h"
#endif

#ifndef PV_OMX_QUEUE_H_INCLUDED
#include "pv_omx_queue.h"
#endif

#ifndef PV_OMXCORE_H_INCLUDED
#include "pv_omxcore.h"
#endif

#ifndef MP3_TIMESTAMP_H_INCLUDED
#include "mp3_timestamp.h"
#endif


#define OMX_PORT_INPUTPORT_INDEX OMX_DirInput
#define OMX_PORT_OUTPUTPORT_INDEX OMX_DirOutput
#define OMX_PORT_ALLPORT_INDEX -1


#define INPUT_BUFFER_SIZE_MP3 8192
#define OUTPUT_BUFFER_SIZE_MP3 4608

#define NUMBER_INPUT_BUFFER_MP3  10
#define NUMBER_OUTPUT_BUFFER_MP3  2


/* Application's private data */
typedef struct Mp3PrivateType
{
    OMX_HANDLETYPE Mp3Handle;

}Mp3PrivateType;


/**
 * This is the Component template from which all
 * other Component instances are factored by the core.
 */


/**
 * The structure for port Type.
 */
typedef struct Mp3ComponentPortType
{
    /** @param pBuffer An array of pointers to buffer headers. */
    OMX_BUFFERHEADERTYPE** pBuffer;
    /** @param BufferState The State of the Buffer whether assigned or allocated */
    OMX_U32* BufferState;
    /** @param NumAssignedBuffers Number of buffer assigned on each port */
    OMX_U32 NumAssignedBuffers;
    /** @param pBufferQueue queue for buffer to be processed by the port */
    QueueType* pBufferQueue;
    OMX_STATETYPE TransientState;
    /** @param BufferUnderProcess  Boolean variables indicate whether the port is processing any buffer */
    OMX_BOOL BufferUnderProcess;
    OMX_PARAM_PORTDEFINITIONTYPE PortParam;
    /** @param NumBufferFlushed Number of buffer Flushed */
    OMX_U32 NumBufferFlushed;
    /** @param IsPortFlushed Boolean variables indicate port is being flushed at the moment */
    OMX_BOOL IsPortFlushed;

    OMX_AUDIO_PARAM_PORTFORMATTYPE	AudioParam;
    OMX_AUDIO_PARAM_MP3TYPE			AudioMp3Param;
    OMX_AUDIO_PARAM_PCMMODETYPE		AudioPcmMode;
    OMX_AUDIO_CONFIG_EQUALIZERTYPE	AudioEqualizerType;

    //Added these flags as a replacement of semaphores on win32 platform
    OMX_BOOL LoadedToIdleFlag ;
    OMX_BOOL IdleToLoadedFlag ;

} Mp3ComponentPortType;


class OpenmaxMp3AO : public OsclActiveObject
{
    public:

        OpenmaxMp3AO();
        ~OpenmaxMp3AO();

        /** Component entry points declarations without proxy interface*/
        static OMX_ERRORTYPE BaseComponentGetComponentVersion(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_OUT OMX_STRING pComponentName,
            OMX_OUT OMX_VERSIONTYPE* pComponentVersion,
            OMX_OUT OMX_VERSIONTYPE* pSpecVersion,
            OMX_OUT OMX_UUIDTYPE* pComponentUUID);

        static OMX_ERRORTYPE BaseComponentGetParameter(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_INDEXTYPE nParamIndex,
            OMX_INOUT OMX_PTR ComponentParameterStructure);

        static OMX_ERRORTYPE BaseComponentSetParameter(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_INDEXTYPE nParamIndex,
            OMX_IN  OMX_PTR ComponentParameterStructure);

        static OMX_ERRORTYPE BaseComponentGetConfig(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_INDEXTYPE nIndex,
            OMX_INOUT OMX_PTR pComponentConfigStructure);

        static OMX_ERRORTYPE BaseComponentSetConfig(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_INDEXTYPE nIndex,
            OMX_IN  OMX_PTR pComponentConfigStructure);

        static OMX_ERRORTYPE BaseComponentGetExtensionIndex(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_STRING cParameterName,
            OMX_OUT OMX_INDEXTYPE* pIndexType);

        static OMX_ERRORTYPE BaseComponentGetState(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_OUT OMX_STATETYPE* pState);

        static OMX_ERRORTYPE BaseComponentUseBuffer(
            OMX_IN OMX_HANDLETYPE hComponent,
            OMX_INOUT OMX_BUFFERHEADERTYPE** ppBufferHdr,
            OMX_IN OMX_U32 nPortIndex,
            OMX_IN OMX_PTR pAppPrivate,
            OMX_IN OMX_U32 nSizeBytes,
            OMX_IN OMX_U8* pBuffer);

        static OMX_ERRORTYPE BaseComponentAllocateBuffer(
            OMX_IN OMX_HANDLETYPE hComponent,
            OMX_INOUT OMX_BUFFERHEADERTYPE** pBuffer,
            OMX_IN OMX_U32 nPortIndex,
            OMX_IN OMX_PTR pAppPrivate,
            OMX_IN OMX_U32 nSizeBytes);

        static OMX_ERRORTYPE BaseComponentFreeBuffer(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_U32 nPortIndex,
            OMX_IN  OMX_BUFFERHEADERTYPE* pBuffer);

        static OMX_ERRORTYPE BaseComponentSendCommand(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_COMMANDTYPE Cmd,
            OMX_IN  OMX_U32 nParam,
            OMX_IN  OMX_PTR pCmdData);

        static OMX_ERRORTYPE BaseComponentComponentDeInit(
            OMX_IN  OMX_HANDLETYPE hComponent);

        static OMX_ERRORTYPE BaseComponentEmptyThisBuffer(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_BUFFERHEADERTYPE* pBuffer);

        static OMX_ERRORTYPE BaseComponentFillThisBuffer(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_BUFFERHEADERTYPE* pBuffer);

        static OMX_ERRORTYPE BaseComponentSetCallbacks(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_CALLBACKTYPE* pCallbacks,
            OMX_IN  OMX_PTR pAppData);

        static void Mp3ComponentGetRolesOfComponent(OMX_STRING* aRoleString);

        /*NON STATIC COUNTERPARTS OF STATIC MEMBER API'S */

        OMX_ERRORTYPE GetParameter(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_INDEXTYPE nParamIndex,
            OMX_INOUT OMX_PTR ComponentParameterStructure);

        OMX_ERRORTYPE SetParameter(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_INDEXTYPE nParamIndex,
            OMX_IN  OMX_PTR ComponentParameterStructure);

        OMX_ERRORTYPE GetConfig(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_INDEXTYPE nIndex,
            OMX_INOUT OMX_PTR pComponentConfigStructure);

        OMX_ERRORTYPE SetConfig(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_INDEXTYPE nIndex,
            OMX_IN  OMX_PTR pComponentConfigStructure);

        OMX_ERRORTYPE GetExtensionIndex(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_STRING cParameterName,
            OMX_OUT OMX_INDEXTYPE* pIndexType);

        void GetState(OMX_OUT OMX_STATETYPE* pState);

        OMX_ERRORTYPE UseBuffer(
            OMX_IN OMX_HANDLETYPE hComponent,
            OMX_INOUT OMX_BUFFERHEADERTYPE** ppBufferHdr,
            OMX_IN OMX_U32 nPortIndex,
            OMX_IN OMX_PTR pAppPrivate,
            OMX_IN OMX_U32 nSizeBytes,
            OMX_IN OMX_U8* pBuffer);

        OMX_ERRORTYPE AllocateBuffer(
            OMX_IN OMX_HANDLETYPE hComponent,
            OMX_INOUT OMX_BUFFERHEADERTYPE** pBuffer,
            OMX_IN OMX_U32 nPortIndex,
            OMX_IN OMX_PTR pAppPrivate,
            OMX_IN OMX_U32 nSizeBytes);

        OMX_ERRORTYPE FreeBuffer(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_U32 nPortIndex,
            OMX_IN  OMX_BUFFERHEADERTYPE* pBuffer);

        OMX_ERRORTYPE SendCommand(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_COMMANDTYPE Cmd,
            OMX_IN  OMX_S32 nParam,
            OMX_IN  OMX_PTR pCmdData);

        OMX_ERRORTYPE EmptyThisBuffer(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_BUFFERHEADERTYPE* pBuffer);

        OMX_ERRORTYPE FillThisBuffer(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_BUFFERHEADERTYPE* pBuffer);

        OMX_ERRORTYPE SetCallbacks(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_CALLBACKTYPE* pCallbacks,
            OMX_IN  OMX_PTR pAppData);

        OMX_ERRORTYPE ConstructComponent(OMX_PTR pAppData);
        OMX_ERRORTYPE DestroyComponent();

        OMX_PTR GetOmxHandle()
        {
            return &iOmxComponent;
        };

        /*OTHER PROCESSING FUNCTIONS */

        void Mp3ComponentBufferMgmtFunction();
        OMX_BOOL Mp3BufferMgmtWithoutMarker(OMX_BUFFERHEADERTYPE*);
        void Mp3Decode();
        OMX_BOOL Mp3ComponentAssemblePartialFrames(OMX_BUFFERHEADERTYPE* aInputBuffer);

        OMX_ERRORTYPE Mp3ComponentMessageHandler(CoreMessage* Message);
        OMX_ERRORTYPE Mp3ComponentDoStateSet(OMX_U32);

        OMX_ERRORTYPE Mp3ComponentDisablePort(OMX_S32 PortIndex);
        void Mp3ComponentDisableSinglePort(OMX_U32 PortIndex);

        OMX_ERRORTYPE Mp3ComponentEnablePort(OMX_S32 PortIndex);
        void Mp3ComponentEnableSinglePort(OMX_U32 PortIndex);

        OMX_ERRORTYPE Mp3ComponentFlushPort(OMX_S32 PortIndex);
        void Mp3ComponentSetPortFlushFlag(OMX_S32, OMX_S32 index, OMX_BOOL value);
        void Mp3ComponentSetNumBufferFlush(OMX_S32, OMX_S32 index, OMX_S32 value);

        OMX_S32 Mp3ComponentPanic();

        void Mp3ComponentReturnInputBuffer(OMX_BUFFERHEADERTYPE* pInputBuffer, Mp3ComponentPortType *pPort);
        void Mp3ComponentReturnOutputBuffer(OMX_BUFFERHEADERTYPE* pOutputBuffer, Mp3ComponentPortType *pPort);

        OMX_ERRORTYPE Mp3ComponentInit();
        OMX_ERRORTYPE Mp3ComponentDeInit();

        OMX_ERRORTYPE Mp3ComponentTunnelRequest(
            OMX_IN  OMX_HANDLETYPE hComp,
            OMX_IN  OMX_U32 nPort,
            OMX_IN  OMX_HANDLETYPE hTunneledComp,
            OMX_IN  OMX_U32 nTunneledPort,
            OMX_INOUT  OMX_TUNNELSETUPTYPE* pTunnelSetup);

        OMX_ERRORTYPE BaseComponentParameterSanityCheck(
            OMX_IN  OMX_HANDLETYPE hComponent,
            OMX_IN  OMX_U32 nPortIndex,
            OMX_IN  OMX_PTR pStructure,
            OMX_IN  size_t size);

        void SetHeader(OMX_PTR aheader, OMX_U32 asize);
        OMX_ERRORTYPE CheckHeader(OMX_PTR aheader, OMX_U32 asize);

        //Flag to call BufferMgmtFunction in the Run() when the component state is executing
        OMX_BOOL			iBufferExecuteFlag;
        Mp3PrivateType*	ipAppPriv;


    private:

        PVLogger* iLogger;

        void Run();
        void CheckForSilenceInsertion();
        void DoSilenceInsertion();

        OMX_CALLBACKTYPE*	ipCallbacks;
        OMX_PTR				iCallbackData;
        OMX_STATETYPE		iState;

        CoreDescriptorType* ipCoreDescriptor;
        OMX_U32				iNumInputBuffer;

        OMX_U8*				ipFrameDecodeBuffer;
        OMX_BOOL			iPartialFrameAssembly;
        OMX_BOOL			iIsInputBufferEnded;
        OMX_BOOL			iEndofStream;
        OMX_U8*				ipTempInputBuffer;
        OMX_U32				iTempInputBufferLength;
        OMX_COMPONENTTYPE*	ipTargetComponent;
        OMX_PTR				iTargetMarkData;
        OMX_BOOL			iNewInBufferRequired;
        OMX_BOOL			iNewOutBufRequired;
        OMX_U32				iTempConsumedLength;
        OMX_U32				iOutBufferCount;
        OMX_BOOL			iCodecReady;
        OMX_U8*				ipInputCurrBuffer;
        OMX_U32				iInputCurrLength;
        OMX_S32				iFrameCount;
        OMX_BOOL			iStateTransitionFlag;
        OMX_BOOL			iFlushPortFlag;
        OMX_BOOL				iEndOfFrameFlag;
        OMX_BUFFERHEADERTYPE*	ipMp3InputBuffer;
        OMX_BUFFERHEADERTYPE*	ipMp3OutputBuffer;

        OMX_U32					iOutputFrameLength;

        OMX_COMPONENTTYPE iOmxComponent;	// structure
        OMX_U32			iNumPorts;

        PV_OMXComponentCapabilityFlagsType iPVCapabilityFlags;

        //The ports of the component
        Mp3ComponentPortType** ipPorts;
        //Indicate whether component has been already initialized */
        OMX_BOOL iIsInit;
        //OpenMAX standard parameter that contains a short description of the available ports
        OMX_PORT_PARAM_TYPE iPortTypesParam;
        OMX_U32 iGroupPriority;
        //ID of a group of components that share the same logical chain
        OMX_U32 iGroupID;
        //Roles of the component
        OMX_U8 iComponentRole[OMX_MAX_STRINGNAME_SIZE];
        //This field holds the private data associated with a mark request, if any
        OMX_MARKTYPE* ipMark;

        //Mp3 specific structure
        Mp3Decoder* ipMp3Dec;

        OMX_BOOL				iFirstFragment;
        OMX_BOOL				iResizePending;
        OMX_TICKS				iFrameTimestamp;
        Mp3TimeStampCalc		iCurrentFrameTS;
        OMX_BOOL				iRepositionFlag;
        OMX_S32					iSamplesPerFrame;
        OMX_BOOL				iSilenceInsertionInProgress;
        OMX_U32					iSilenceFramesNeeded;
        OMX_U32					iOutputMilliSecPerFrame;

};

#endif // OMX_MP3_COMPONENT_H_INCLUDED
