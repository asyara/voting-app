/**
 * Created by Acer on 06.08.2017.
 */
var webpack = require('webpack');
var CopyWebpackPlugin = require('copy-webpack-plugin');
var ExtractTextPlugin = require('extract-text-webpack-plugin');

var config = {
    context: __dirname + '/ui',
    entry: {
        index: './app/js/index'
    },

    output: {
        path: __dirname + '/src/main/webapp/dist',
        filename: '[name].js',
        library: '[name]'
    },

    devtool: '#cheap-module-source-map',

    module: {
        loaders: [
            {
                test: /\.(js|jsx)$/,
                exclude: /node_modules/,
                loader: 'babel-loader',
                query: {
                    presets: ['es2015', 'stage-2', 'react']
                }
            },
            {
                test: /\.(html)$/,
                exclude: /\/node_modules\//,
                loader: 'file?name=../[path][name].[ext]'
            },
            {
                test: /\.scss$/,
                loader: ExtractTextPlugin.extract({
                    fallback: './scss/app.scss',
                    use: ['style-loader', 'css-loader!resolve-url!sass-loader?sourceMap']
                })
            }
        ],
        rules: [
            {
                test: /\.scss$/,
                use: ExtractTextPlugin.extract({
                    fallbackLoader: 'style-loader',
                    loader: ['css-loader', 'sass-loader'],
                    publicPath: './ui/app/css'
                })
            },
            {
                test: /\.(js|jsx)$/,
                use: [
                    {loader: 'babel-loader', options: {presets: ['es2015', 'react', 'stage-2']}}
                ],
                exclude: /node_modules/
            }
        ]
    },

    plugins: [
        new CopyWebpackPlugin([
            {from: './*.html', to: '../'},
            {from: './*/*.html', to: '../'}
        ]),
        new ExtractTextPlugin({
            filename: '../style/app.css',
            allChunks: true
        })
    ],

    watch: true,
    watchOptions: {
        ignored: '/node_modules/'
    }
};

module.exports = config;