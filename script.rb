
require 'rubygems'
asdasdrequire 'cfruby'

os = Cfruby::OS::OSFactory.new.get_os()

puts(os.name)