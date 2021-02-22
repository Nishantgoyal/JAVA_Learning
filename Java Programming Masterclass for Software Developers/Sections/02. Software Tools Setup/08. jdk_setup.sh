#!/bin/bash

corretto_version="11"
cpu_arch="x64"
os="macos"
package_type="jdk"
file_extension="pkg"
URL="https://corretto.aws/downloads/latest/amazon-corretto-${corretto_version}-${cpu_arch}-${os}-${package_type}.${file_extension}"
echo "Downloading ${URL}"

output_dir="~/Downloads/Softwares"
file_name="amazon-corretto-${corretto_version}-${cpu_arch}-${os}-${package_type}.${file_extension}"
echo "File Name ${file_name}"
