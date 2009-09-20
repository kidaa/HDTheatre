/*
    This file is part of the WebKit open source project.
    This file has been generated by generate-bindings.pl. DO NOT MODIFY!

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Library General Public
    License as published by the Free Software Foundation; either
    version 2 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Library General Public License for more details.

    You should have received a copy of the GNU Library General Public License
    along with this library; see the file COPYING.LIB.  If not, write to
    the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
    Boston, MA 02110-1301, USA.
*/

#include "config.h"

#include "JSJavaScriptCallFrame.h"

#include <wtf/GetPtr.h>

#include "JSJavaScriptCallFrame.h"
#include "JavaScriptCallFrame.h"
#include "KURL.h"

#include <runtime/Error.h>
#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSJavaScriptCallFrame)

/* Hash table */

static const HashTableValue JSJavaScriptCallFrameTableValues[8] =
{
    { "caller", DontDelete|ReadOnly, (intptr_t)jsJavaScriptCallFrameCaller, (intptr_t)0 },
    { "sourceID", DontDelete|ReadOnly, (intptr_t)jsJavaScriptCallFrameSourceID, (intptr_t)0 },
    { "line", DontDelete|ReadOnly, (intptr_t)jsJavaScriptCallFrameLine, (intptr_t)0 },
    { "scopeChain", DontDelete|ReadOnly, (intptr_t)jsJavaScriptCallFrameScopeChain, (intptr_t)0 },
    { "thisObject", DontDelete|ReadOnly, (intptr_t)jsJavaScriptCallFrameThisObject, (intptr_t)0 },
    { "functionName", DontDelete|ReadOnly, (intptr_t)jsJavaScriptCallFrameFunctionName, (intptr_t)0 },
    { "type", DontDelete|ReadOnly, (intptr_t)jsJavaScriptCallFrameType, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSJavaScriptCallFrameTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 63, JSJavaScriptCallFrameTableValues, 0 };
#else
    { 17, 15, JSJavaScriptCallFrameTableValues, 0 };
#endif

/* Hash table for prototype */

static const HashTableValue JSJavaScriptCallFramePrototypeTableValues[2] =
{
    { "evaluate", DontDelete|Function, (intptr_t)jsJavaScriptCallFramePrototypeFunctionEvaluate, (intptr_t)1 },
    { 0, 0, 0, 0 }
};

static const HashTable JSJavaScriptCallFramePrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSJavaScriptCallFramePrototypeTableValues, 0 };
#else
    { 2, 1, JSJavaScriptCallFramePrototypeTableValues, 0 };
#endif

const ClassInfo JSJavaScriptCallFramePrototype::s_info = { "JavaScriptCallFramePrototype", 0, &JSJavaScriptCallFramePrototypeTable, 0 };

JSObject* JSJavaScriptCallFramePrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSJavaScriptCallFrame>(exec);
}

bool JSJavaScriptCallFramePrototype::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticFunctionSlot<JSObject>(exec, &JSJavaScriptCallFramePrototypeTable, this, propertyName, slot);
}

const ClassInfo JSJavaScriptCallFrame::s_info = { "JavaScriptCallFrame", 0, &JSJavaScriptCallFrameTable, 0 };

JSJavaScriptCallFrame::JSJavaScriptCallFrame(PassRefPtr<Structure> structure, PassRefPtr<JavaScriptCallFrame> impl)
    : DOMObject(structure)
    , m_impl(impl)
{
}

JSJavaScriptCallFrame::~JSJavaScriptCallFrame()
{
    forgetDOMObject(*Heap::heap(this)->globalData(), m_impl.get());

}

JSObject* JSJavaScriptCallFrame::createPrototype(ExecState* exec)
{
    return new (exec) JSJavaScriptCallFramePrototype(JSJavaScriptCallFramePrototype::createStructure(exec->lexicalGlobalObject()->objectPrototype()));
}

bool JSJavaScriptCallFrame::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSJavaScriptCallFrame, Base>(exec, &JSJavaScriptCallFrameTable, this, propertyName, slot);
}

JSValuePtr jsJavaScriptCallFrameCaller(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    JavaScriptCallFrame* imp = static_cast<JavaScriptCallFrame*>(static_cast<JSJavaScriptCallFrame*>(asObject(slot.slotBase()))->impl());
    return toJS(exec, WTF::getPtr(imp->caller()));
}

JSValuePtr jsJavaScriptCallFrameSourceID(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    JavaScriptCallFrame* imp = static_cast<JavaScriptCallFrame*>(static_cast<JSJavaScriptCallFrame*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->sourceID());
}

JSValuePtr jsJavaScriptCallFrameLine(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    JavaScriptCallFrame* imp = static_cast<JavaScriptCallFrame*>(static_cast<JSJavaScriptCallFrame*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->line());
}

JSValuePtr jsJavaScriptCallFrameScopeChain(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSJavaScriptCallFrame*>(asObject(slot.slotBase()))->scopeChain(exec);
}

JSValuePtr jsJavaScriptCallFrameThisObject(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSJavaScriptCallFrame*>(asObject(slot.slotBase()))->thisObject(exec);
}

JSValuePtr jsJavaScriptCallFrameFunctionName(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    JavaScriptCallFrame* imp = static_cast<JavaScriptCallFrame*>(static_cast<JSJavaScriptCallFrame*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->functionName());
}

JSValuePtr jsJavaScriptCallFrameType(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSJavaScriptCallFrame*>(asObject(slot.slotBase()))->type(exec);
}

JSValuePtr jsJavaScriptCallFramePrototypeFunctionEvaluate(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSJavaScriptCallFrame::s_info))
        return throwError(exec, TypeError);
    JSJavaScriptCallFrame* castedThisObj = static_cast<JSJavaScriptCallFrame*>(asObject(thisValue));
    return castedThisObj->evaluate(exec, args);
}

JSC::JSValuePtr toJS(JSC::ExecState* exec, JavaScriptCallFrame* object)
{
    return getDOMObjectWrapper<JSJavaScriptCallFrame>(exec, object);
}
JavaScriptCallFrame* toJavaScriptCallFrame(JSC::JSValuePtr value)
{
    return value.isObject(&JSJavaScriptCallFrame::s_info) ? static_cast<JSJavaScriptCallFrame*>(asObject(value))->impl() : 0;
}

}
