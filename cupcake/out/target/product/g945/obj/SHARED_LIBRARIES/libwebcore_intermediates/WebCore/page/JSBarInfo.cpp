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

#include "JSBarInfo.h"

#include <wtf/GetPtr.h>

#include "BarInfo.h"


using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSBarInfo)

/* Hash table */

static const HashTableValue JSBarInfoTableValues[2] =
{
    { "visible", DontDelete|ReadOnly, (intptr_t)jsBarInfoVisible, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSBarInfoTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSBarInfoTableValues, 0 };
#else
    { 2, 1, JSBarInfoTableValues, 0 };
#endif

/* Hash table for prototype */

static const HashTableValue JSBarInfoPrototypeTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSBarInfoPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSBarInfoPrototypeTableValues, 0 };
#else
    { 1, 0, JSBarInfoPrototypeTableValues, 0 };
#endif

const ClassInfo JSBarInfoPrototype::s_info = { "BarInfoPrototype", 0, &JSBarInfoPrototypeTable, 0 };

JSObject* JSBarInfoPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSBarInfo>(exec);
}

const ClassInfo JSBarInfo::s_info = { "BarInfo", 0, &JSBarInfoTable, 0 };

JSBarInfo::JSBarInfo(PassRefPtr<Structure> structure, PassRefPtr<BarInfo> impl)
    : DOMObject(structure)
    , m_impl(impl)
{
}

JSBarInfo::~JSBarInfo()
{
    forgetDOMObject(*Heap::heap(this)->globalData(), m_impl.get());

}

JSObject* JSBarInfo::createPrototype(ExecState* exec)
{
    return new (exec) JSBarInfoPrototype(JSBarInfoPrototype::createStructure(exec->lexicalGlobalObject()->objectPrototype()));
}

bool JSBarInfo::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSBarInfo, Base>(exec, &JSBarInfoTable, this, propertyName, slot);
}

JSValuePtr jsBarInfoVisible(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    BarInfo* imp = static_cast<BarInfo*>(static_cast<JSBarInfo*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->visible());
}

JSC::JSValuePtr toJS(JSC::ExecState* exec, BarInfo* object)
{
    return getDOMObjectWrapper<JSBarInfo>(exec, object);
}
BarInfo* toBarInfo(JSC::JSValuePtr value)
{
    return value.isObject(&JSBarInfo::s_info) ? static_cast<JSBarInfo*>(asObject(value))->impl() : 0;
}

}
