using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Zendeskchat.RNZendeskchat
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNZendeskchatModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNZendeskchatModule"/>.
        /// </summary>
        internal RNZendeskchatModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNZendeskchat";
            }
        }
    }
}
